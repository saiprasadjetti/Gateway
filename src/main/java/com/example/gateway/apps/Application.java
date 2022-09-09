package com.example.gateway.apps;

public class Application {
    String host;
    String port;
    String serverType;

    public Application(String host, String port, String serverType){
        this.host = host;
        this.port = port;
        this.serverType = serverType;
    }
}
