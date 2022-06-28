package com.pepperfry.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PepperfryConfigService1Application {

	public static void main(String[] args) {
		SpringApplication.run(PepperfryConfigService1Application.class, args);
	}

}
