package com.test.config;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@ComponentScan({"com.test.controller","com.test.config","com.test.repository"})
@EnableAutoConfiguration
@Import({CassandraConfig.class})
public class Application extends SpringBootServletInitializer {

	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(Application.class,CassandraConfig.class);
	 }
	 
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);


    }

}