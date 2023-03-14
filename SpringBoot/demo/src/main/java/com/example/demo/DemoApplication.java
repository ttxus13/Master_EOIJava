package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RequestMapping("/hola")
	String hellow() {
		return "Hellooooou World";
	}
	@RequestMapping("/gif")
	String gif() {
		return "<IMG SRC=\"https://educacion30.b-cdn.net/wp-content/uploads/2019/06/homer.gif\">";
	}

}

