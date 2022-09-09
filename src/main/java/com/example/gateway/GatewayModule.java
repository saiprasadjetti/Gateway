package com.example.gateway;

import com.example.gateway.apps.ApplicationDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GatewayModule {
    @Bean
    public ApplicationDetails getApplicationDetails(){
        return new ApplicationDetails();
    }
}
