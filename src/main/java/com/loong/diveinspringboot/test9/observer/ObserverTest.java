package com.loong.diveinspringboot.test9.observer;

import org.apache.logging.log4j.message.MapMessage;

public class ObserverTest {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers(new MapMessage<>());
    }

}
