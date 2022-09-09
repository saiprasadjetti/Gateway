package com.example.gateway.apps;

import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;
public class ApplicationDetails {

    Map<String, Application> applications = new HashMap<>();

    public ApplicationDetails() {
        applications.put("one", new Application("localhost", "8081", "RestAPI"));
        applications.put("two", new Application("localhost", "8082", "RestAPI"));
        applications.put("three", new Application("localhost", "8083", "RestAPI"));
    }

    Application getApplication(String appId) {
        return applications.get(appId);
    }
}
