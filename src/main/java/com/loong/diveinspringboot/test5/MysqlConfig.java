package com.loong.diveinspringboot.test5;

import java.util.Map;

public class MysqlConfig implements Viewer{

    private ConfigSource configSource;

    private String address;

    private int timeout;

    private int maxTotal;

    public MysqlConfig(ConfigSource configSource) {

    }

    public String getAddress() {
        return null;
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
