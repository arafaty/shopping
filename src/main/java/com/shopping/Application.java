package com.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Equivalent to @Configuration + @EnableAutoConfiguration + @EnableWebMvc (if soring-webmvc jar on the classpath) + @ComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
