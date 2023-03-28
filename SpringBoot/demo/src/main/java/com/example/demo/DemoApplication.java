package com.example.demo;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



/**

 * La Clase MySpringBootApplication, clase padre de la aplicaci&oacute;n SpringBoot

 */

@SpringBootApplication

@RestController

public class DemoApplication {



	/**

	 * The entry point of application.

	 *

	 * @param args the input arguments

	 */

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}



	/**

	 * Hello main  string.

	 *

	 * @return  el string por defecto "Main Class" para testear la aplicación

	 */

	@GetMapping("/")

	String helloMain() {

		return "Main class";

	}



}