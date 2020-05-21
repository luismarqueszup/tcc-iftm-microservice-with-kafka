package br.com.send;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "br.com.send")
@SpringBootApplication
public class SendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendApplication.class, args);
	}

}
