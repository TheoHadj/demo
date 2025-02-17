package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.model.HelloWorld;

@Component
public class HelloWorldService {
    public HelloWorldService() {
    }

    public static HelloWorld getHelloWorld() {
        HelloWorld hw = new HelloWorld("Holà world!!");
        return hw;
    }
}
