package com.example.demoapp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demoapp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demoapp2Application.class, args);
	}

	@RequestMapping("/")
	public String index() {
		String s = "hi\n";
		System.out.println(s);
		return s;
	}

}
