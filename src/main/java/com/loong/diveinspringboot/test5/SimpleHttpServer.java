package com.loong.diveinspringboot.test5;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleHttpServer {

    private String host;

    private int port;


    private Map<String, List<Viewer>> map = new HashMap<>();

    public SimpleHttpServer(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void addViewer(String url, Viewer viewer) {

        List<Viewer> viewers = map.get(url);
        if (!CollectionUtils.isEmpty(viewers)) {
            viewers.add(viewer);
            return;
        }

        map.put(url, new ArrayList<>(viewers));
    }

    public void run() {
        List<Viewer> viewers = map.get("/config");
        viewers.forEach(Viewer::output);

    }


}
