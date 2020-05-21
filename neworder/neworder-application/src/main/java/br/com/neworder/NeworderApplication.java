package br.com.neworder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"br.com.neworder"})
@SpringBootApplication
public class NeworderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeworderApplication.class, args);
	}

}
