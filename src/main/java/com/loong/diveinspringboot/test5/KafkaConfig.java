package com.loong.diveinspringboot.test5;

public class KafkaConfig implements Updater{

    private ConfigSource configSource;

    private String address;

    private int timeout;

    private int maxTotal;

    public KafkaConfig(ConfigSource configSource) {

    }

    public String getAddress() {
        return null;
    }


    @Override
    public void update() {

    }
}
