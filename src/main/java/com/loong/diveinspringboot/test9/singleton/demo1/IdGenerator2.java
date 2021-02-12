package com.loong.diveinspringboot.test9.singleton.demo1;

public class IdGenerator2 {

    private static IdGenerator2 idGenerator2;


    private IdGenerator2() {

    }

    public static synchronized IdGenerator2 getIdGenerator2() {

        if (idGenerator2 == null) {
            idGenerator2 = new IdGenerator2();
        }

        return idGenerator2;
    }



}
