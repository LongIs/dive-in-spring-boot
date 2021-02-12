package com.loong.diveinspringboot.test9.singleton.demo1;

public class IdGenerator3 {

    private static IdGenerator3 idGenerator3;

    private IdGenerator3() {

    }

    public static IdGenerator3 getIdGenerator3() {
        if (idGenerator3 == null) {
            synchronized (IdGenerator3.class) {
                if (idGenerator3 == null) {
                    idGenerator3 = new IdGenerator3();
                }
            }
        }
        return idGenerator3;

    }

}
