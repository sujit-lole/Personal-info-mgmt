package com.org.record;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.org.record")
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories
public class RecordSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecordSystemApplication.class, args);
	}
}
