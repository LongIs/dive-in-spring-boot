package com.loong.diveinspringboot.test9.observer;

import org.apache.logging.log4j.message.Message;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);

}
