package com.example.demo.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.HelloWorldService;

@Component
public class HelloWorld implements CommandLineRunner {
    private String value;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!!");
		// HelloWorld hw = new HelloWorld("Holà world!!");
        HelloWorld hw = HelloWorldService.getHelloWorld();
		System.out.println(hw.getValue());

        

	}
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