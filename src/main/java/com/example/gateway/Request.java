package com.example.gateway;


import java.util.List;

public class Request {
    public List<String> getApps() {
        return apps;
    }

    public void setApps(List<String> apps) {
        this.apps = apps;
    }

    List<String> apps;
}
