package com.techfynder;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class TechFynderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechFynderApplication.class, args);
	}
	
	@Bean
	   public Docket documentation() {
	       return new Docket(DocumentationType.SWAGGER_2)
	               .select()
	               .apis(RequestHandlerSelectors.any())
	               .paths(regex("/.*"))
	               .build()
	               .pathMapping("/")
	               .apiInfo(metadata());
	   }

	   @Bean
	   public UiConfiguration uiConfig() {
	       return UiConfiguration.DEFAULT;
	   }

	   private ApiInfo metadata() {
	       return new ApiInfoBuilder()
	               .title("Techfynder Application")
	               .description("Documentation for Techfynder Application")
	               .version("1.0")
	               .contact(new Contact("Sandeep Potnuru","techfynder.com","sandeeppotnuru96@gmail.com"))
	               .build();
	   }

}
