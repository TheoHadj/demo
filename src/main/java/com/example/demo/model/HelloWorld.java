package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private String value;

    public HelloWorld() {
    }

    public HelloWorld(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public HelloWorld getHelloWorld(){
        return this;
    }
}