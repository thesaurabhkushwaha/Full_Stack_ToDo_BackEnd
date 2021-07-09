package com.in18minutes.rest.webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class RestIn28minutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestIn28minutesApplication.class, args);
	}
	
	@Bean
    public Docket CustomerApi() {
     return new Docket(DocumentationType.SWAGGER_2)
    		 .select()
    		 .apis(RequestHandlerSelectors.basePackage("com.in28minutes.rest.webservices.todo.TodoController"))
    		 .build();
               
	}

}
