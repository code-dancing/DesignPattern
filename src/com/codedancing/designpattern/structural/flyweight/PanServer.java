package com.codedancing.designpattern.structural.flyweight;

import com.codedancing.designpattern.structural.flyweight.util.HashUtil;
import com.codedancing.designpattern.structural.flyweight.util.ReadFileUtil;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

/**
 * 网盘服务，相当于享元工厂（FlyWeightFactory）
 */
public class PanServer {

    /**
     * 单例模式 - 网盘服务
     */
    private static PanServer server = new PanServer();
    /**
     * 文件资源池，相当于享元池，只保留不同的文件资源 (hashId : Resource)
     */
    private Map<String, Resource> resourceSystem;
    /**
     * 用户文件列表 (filename : UserFile)
     */
    private Map<String, UserFile> fileSystem;
    /**
     * 文件上传位置
     */
    private final String DEST_FILEPATH = Thread.currentThread().getContextClassLoader().getResource("").getPath() + "com/codedancing/designpattern/structural/flyweight/files/";

    private PanServer() {
        resourceSystem = new HashMap<>();
        fileSystem = new HashMap<>();
    }

    public static PanServer getInstance() {
        return server;
    }

    /**
     * 上传文件
     */
    public void upload(String username, String fileName, String filePath) {
        long startTime = System.currentTimeMillis();
        System.out.println("准备上传文件： " + fileName);

        File source = new File(filePath);
        File dest = new File(DEST_FILEPATH + fileName);
        if (dest.exists()) {
            System.out.println("文件名称已存在，请重新上传\n\n");
            return;
        }
        // 检测文件
        String hashId = HashUtil.computeHashId(ReadFileUtil.readFileToBytes(filePath));

        try {
            if (resourceSystem.containsKey(hashId)) {
                System.out.println(String.format("Server：检测到内容相同的文件 [ %s ]，为了节约空间，重用文件", fileName));
                // 取出资源池中重复的文件资源
                Resource resource = resourceSystem.get(hashId);
                // 保存新文件至用户文件
                fileSystem.put(fileName, new UserFile(username, fileName, resource));
                Thread.sleep(100);
            } else {
                System.out.println("正在上传文件： " + fileName + " ...");
                // 开始上传
                uploadFileToServer(source, dest);
                // 添加文件资源到资源池
                Resource resource = new Resource(hashId, dest.length(), ReadFileUtil.readFileToBytes(DEST_FILEPATH + fileName));
                resourceSystem.put(hashId, resource);
                fileSystem.put(fileName, new UserFile(username, fileName, resource));
                // 上传文件需要耗费一定时间
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println(String.format("文件上传完成，共耗费 %s 毫秒\n\n", endTime - startTime));
    }


    /**
     * 上传指定文件到指定目录
     */
    private void uploadFileToServer(File source, File dest) {
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;

        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputChannel != null) {
                    inputChannel.close();
                }
                if (outputChannel != null) {
                    outputChannel.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 下载文件（模拟）
     */
    public void download(String fileName) {
        UserFile file = fileSystem.get(fileName);
        if (file == null) {
            System.out.println("文件不存在");
        } else {
            System.out.println("下载文件 --- " + file);
        }
    }

}
