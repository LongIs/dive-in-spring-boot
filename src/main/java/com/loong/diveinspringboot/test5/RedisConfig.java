package com.loong.diveinspringboot.test5;

import java.util.Map;

public class RedisConfig implements Updater, Viewer{

    private ConfigSource configSource;

    private String address;

    private int timeout;

    private int maxTotal;

    public RedisConfig(ConfigSource configSource) {

    }

    public String getAddress() {
        return null;
    }


    @Override
    public void update() {

    }

    @Override
    public String outputInPlainText() {
        return null;
    }

    @Override
    public Map<String, String> output() {
        return null;
    }
}
