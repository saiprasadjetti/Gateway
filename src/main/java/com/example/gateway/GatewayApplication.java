package com.example.gateway;

import com.example.gateway.apps.ApplicationDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.example.gateway"})
@RestController
public class GatewayApplication {
    @Autowired
    ApplicationDetails applicationDetails;
    public static void main(String[] args) {

        SpringApplication.run(GatewayApplication.class, args);
    }
    @GetMapping("/simple-request")
    public String simpleRequest() {
        // In this case, we return the plain text response "ok"
        return String.valueOf(applicationDetails != null);
    }
    @PostMapping(value = "/request",produces ={MediaType.APPLICATION_JSON_VALUE})
    FinalResponse newStudent(@RequestBody Request request) {
        System.out.println("AppId : "+request.getApps());
        return new FinalResponse();
    }
}
