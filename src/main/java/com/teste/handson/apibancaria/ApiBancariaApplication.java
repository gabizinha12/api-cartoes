package com.teste.handson.apibancaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
public class ApiBancariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBancariaApplication.class, args);
	}

}
