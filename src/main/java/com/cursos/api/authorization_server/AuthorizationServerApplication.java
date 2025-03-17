package com.cursos.api.authorization_server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AuthorizationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServerApplication.class, args);

	}
	@Bean
	public CommandLineRunner createPasswordEncoder(PasswordEncoder passwordEncoder) {
		return args -> System.out.println("Password: " + passwordEncoder.encode("12345678"));
	}

}
