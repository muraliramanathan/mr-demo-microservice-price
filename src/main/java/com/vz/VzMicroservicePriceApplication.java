package com.vz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VzMicroservicePriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VzMicroservicePriceApplication.class, args);
	}
}
