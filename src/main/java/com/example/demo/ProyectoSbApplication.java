package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demo.Controller")
public class ProyectoSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSbApplication.class, args);
	}

}

