package com.gl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket libraryApi()
	{
		return new Docket(DocumentationType.SWAGGER_2).groupName("Employee-API").select().apis(RequestHandlerSelectors.basePackage("com.gl.controller")).build();
	}

	
}
