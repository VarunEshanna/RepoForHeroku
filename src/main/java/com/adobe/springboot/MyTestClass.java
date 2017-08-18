package com.adobe.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.adobe.controller")
public class MyTestClass {

	public static void main(String[] args) {
		SpringApplication.run(MyTestClass.class, args);
	}

	@RequestMapping("/index")
  	public String index() {
    	return "index";
  	}

}
