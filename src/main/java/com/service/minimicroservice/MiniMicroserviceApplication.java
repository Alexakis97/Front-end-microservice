package com.service.minimicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.service.minimicroservice.objects.Mail;

@SpringBootApplication
public class MiniMicroserviceApplication {

	@Bean
	public Mail getMailObject()
	{
		return new Mail();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MiniMicroserviceApplication.class, args);
	}

}
