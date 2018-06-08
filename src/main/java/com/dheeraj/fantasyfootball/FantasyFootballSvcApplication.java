package com.dheeraj.fantasyfootball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class FantasyFootballSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(FantasyFootballSvcApplication.class, args);
	}
}
