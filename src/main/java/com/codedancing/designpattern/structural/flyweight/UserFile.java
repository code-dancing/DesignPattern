package com.codedancing.designpattern.structural.flyweight;

/**
 * 用户的文件类，相当于具体享元类（ConcreteFlyweight）
 *
 * 其中的 resource 为内部状态，owner 和 filename为外部状态、非享元（UnsharedConcreteFlyWeight），外部状态不可共享
 */
public class UserFile {

    /**
     * 文件名
     */
    private String filename;
    /**
     * 用户
     */
    private String owner;
    /**
     * 文件资源信息
     */
    private Resource resource;

    public UserFile(String owner, String filename, Resource resource) {
        this.owner = owner;
        this.filename = filename;
        this.resource = resource;
    }

    public String getFilename() {
        return filename;
    }

    public String getOwner() {
        return owner;
    }

    public Resource getResource() {
        return resource;
    }

    @Override
    public String toString() {
        return "" +
                "文件名：" + filename +
                ", 用户：" + owner +
                ", 资源信息：" + resource;
    }
}
