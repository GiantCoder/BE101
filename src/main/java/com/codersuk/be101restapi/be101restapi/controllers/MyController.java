package com.codersuk.be101restapi.be101restapi.controllers;

import com.codersuk.be101restapi.be101restapi.models.HelloWorldResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.codersuk.be101restapi.be101restapi.models.APIStats;

@RestController
public class MyController {

    private int calculateSequenceTotal(int number) {
        int sum = 0;
        for (int i = number; i >=0; i--) {
            sum += i;
        }
        return sum;
    }

    @GetMapping("helloWorld/{number}")
    public HelloWorldResponse helloWorld(@PathVariable int number) {
        APIStats.incrementRequestCount();
        int total = calculateSequenceTotal(number);
        HelloWorldResponse helloWorldResponse = new HelloWorldResponse();
        helloWorldResponse.sum = total;
        helloWorldResponse.requestCount = APIStats.numRequests;
        return helloWorldResponse;
    }
}