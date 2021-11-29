package com.loong.diveinspringboot.test9.observer;

import org.apache.logging.log4j.message.Message;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        observerList.forEach(v -> v.update(message));
    }
}
