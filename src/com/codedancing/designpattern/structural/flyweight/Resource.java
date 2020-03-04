package com.codedancing.designpattern.structural.flyweight;

/**
 * 资源类 Resource，相当于享元类的内部状态
 */
public class Resource {

    /**
     * 文件资源唯一ID
     */
    private String hashId;
    /**
     * 文件大小
     */
    private long byteSize;
    /**
     * 文件内容
     */
    private byte[] content;

    public Resource(String hashId, long byteSize, byte[] content) {
        this.hashId = hashId;
        this.byteSize = byteSize;
        this.content = content;
    }

    public String getHashId() {
        return hashId;
    }

    public long getByteSize() {
        return byteSize;
    }

    public byte[] getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "{ 资源ID=" + hashId +
                ", 文件大小=" + byteSize +
                " bytes }";
    }
}
