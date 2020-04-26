package com.serviceregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BourseServiceRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BourseServiceRegistrationApplication.class, args);
	}

}
