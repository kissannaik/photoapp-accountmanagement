package com.kissan.photoappaccountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoappAccountmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoappAccountmanagementApplication.class, args);
	}

}
