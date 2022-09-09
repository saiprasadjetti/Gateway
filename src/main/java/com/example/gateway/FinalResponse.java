package com.example.gateway;

import com.example.gateway.apps.ApplicationOneResponse;
import com.example.gateway.apps.ApplicationThreeResponse;
import com.example.gateway.apps.ApplicationTwoResponse;

public class FinalResponse {

    public ApplicationOneResponse getApplicationOneResponse() {
        return applicationOneResponse;
    }

    public void setApplicationOneResponse(ApplicationOneResponse applicationOneResponse) {
        this.applicationOneResponse = applicationOneResponse;
    }

    public ApplicationTwoResponse getApplicationTwoResponse() {
        return applicationTwoResponse;
    }

    public void setApplicationTwoResponse(ApplicationTwoResponse applicationTwoResponse) {
        this.applicationTwoResponse = applicationTwoResponse;
    }

    public ApplicationThreeResponse getApplicationThreeResponse() {
        return applicationThreeResponse;
    }

    public void setApplicationThreeResponse(ApplicationThreeResponse applicationThreeResponse) {
        this.applicationThreeResponse = applicationThreeResponse;
    }

    ApplicationOneResponse applicationOneResponse;
    ApplicationTwoResponse applicationTwoResponse;
    ApplicationThreeResponse applicationThreeResponse;
}
