package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.HelloWorld;
import com.example.demo.service.HelloWorldService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!!qsdqsd");
		// HelloWorld hw = new HelloWorld("Holà world!!");
		// getHelloWorld();

	}

}
