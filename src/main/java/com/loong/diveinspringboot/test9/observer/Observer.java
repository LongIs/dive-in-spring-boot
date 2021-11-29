package com.loong.diveinspringboot.test9.observer;

import org.apache.logging.log4j.message.Message;

public interface Observer {

    void update(Message message);

}
