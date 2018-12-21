package com.github.kettoleon.mera.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages =  "com.github.kettoleon.mera")
public class MeraServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeraServerApplication.class, args);
	}
}
