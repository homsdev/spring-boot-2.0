package com.homsdev.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.homsdev.demo.config.DataSourceConfig;

@SpringBootApplication
public class SpringBootBasicApplication implements CommandLineRunner{

	@Autowired
	DataSourceConfig config;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(config.getDatasource());
	}

}
