package com.loong.diveinspringboot.test9.visitor;

public class Compressor implements Visitor{

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("compress PPT.");
    }

    @Override
    public void visit(PPTFile pdfFile) {
        System.out.println("compress PDF.");
    }

    @Override
    public void visit(WordFile pdfFile) {
        System.out.println("compress WORD.");
    }
}
