package com.javatechie.springbootawsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootAwsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsExampleApplication.class, args);
	}

	@GetMapping("/status")
	public String home() {
		return "Application Deployed in Elastic Bean Stalk....!!";
	}

}
