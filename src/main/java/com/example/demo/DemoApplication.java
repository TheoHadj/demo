package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.HelloWorld;
import com.example.demo.service.HelloWorldService;
import com.example.demo.service.LivreService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private LivreService ls;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        System.out.println("Hello World!!");
        HelloWorld hw = HelloWorldService.getHelloWorld();
		System.out.println(hw.getValue());
        // ls.addLivre();
		ls.addSomeLivres();


	}

}
