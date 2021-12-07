package com.loong.diveinspringboot.test9.state;

import com.loong.diveinspringboot.test9.state.table.State;

public interface IMario {

    State getName(); //以下是定义的事件

    // 获得蘑菇
    void obtainMushRoom();
    // 获得披风
    void obtainCape();
    // 获得火花
    void obtainFireFlower();
    // 遇见怪物
    void meetMonster();

}
