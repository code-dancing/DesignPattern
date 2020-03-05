package com.codedancing.designpattern.structural.flyweight.util;

import java.io.*;

/**
 * 读取文件的工具类
 */
public class ReadFileUtil {

    /**
     * 将文件内容读取为Bytes
     */
    public static byte[] readFileToBytes(String filePath) {
        File file = new File(filePath);
        BufferedInputStream bis = null;
        ByteArrayOutputStream bos = null;

        try {

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            bis = new BufferedInputStream(new FileInputStream(file));
            bos = new ByteArrayOutputStream((int) file.length());
            int bufferedSize = 1024;
            byte[] buffer = new byte[bufferedSize];
            int len = 0;
            while ((len = bis.read(buffer, 0, bufferedSize)) != -1) {
                bos.write(buffer, 0, len);
            }

            return bos.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0];
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
