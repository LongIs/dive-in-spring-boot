package com.loong.diveinspringboot.test9.visitor;

public class PdfFile extends ResourceFile{

    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
