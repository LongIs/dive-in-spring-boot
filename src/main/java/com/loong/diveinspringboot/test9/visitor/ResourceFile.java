package com.loong.diveinspringboot.test9.visitor;

public abstract class ResourceFile {

    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract public void accept(Visitor visitor);

}
