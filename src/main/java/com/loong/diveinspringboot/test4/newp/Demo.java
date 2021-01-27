package com.loong.diveinspringboot.test4.newp;

public class Demo {

    public static void main(String[] args) {
        ApiStatInfo info = new ApiStatInfo();
        ApplicationContext.getInstance().getAlert().check(info);
    }
}
