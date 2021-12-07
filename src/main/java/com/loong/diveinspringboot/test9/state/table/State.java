package com.loong.diveinspringboot.test9.state.table;

public enum State {
    // 小的
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);

    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
