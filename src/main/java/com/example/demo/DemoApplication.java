package com.example.demo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.swing.plaf.basic.BasicToolBarUI;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
@Bean
	public OpenAPI customOpenAPI(){
		return  new OpenAPI()
				.info(new Info()
						.title("Cloud Vendor API Application")
						.description("Cloud Vendor API Documentation")
						.version("1.0"));
}
}
