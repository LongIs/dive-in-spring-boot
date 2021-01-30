package com.loong.diveinspringboot.test6.new1;

public abstract class TestCase {

    public abstract boolean doTest();


    public void run () {

        if (this.doTest()) {

            System.out.println("12312");

        } else {

            System.out.println("33333");

        }

    }

}
