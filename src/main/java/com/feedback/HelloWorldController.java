package com.feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableCaching
@RestController
public class HelloWorldController {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}
	
	@Autowired
	private IHelloWorldService helloWorldService;
	
	@GetMapping("api/hello")
	public String printHelloWorld() {
		return helloWorldService.getTextToPrint();
	}
	
}
