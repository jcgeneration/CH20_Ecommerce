package org.generation.ecommerce;

import org.generation.ecommerce.jwt.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}//main
	
//	@Bean
//	public FilterRegistrationBean<JwtFilter> jwtFilter(){
//		FilterRegistrationBean<JwtFilter> registrationBean = new FilterRegistrationBean<>();
//		registrationBean.setFilter(new JwtFilter());
//		registrationBean.addUrlPatterns("/api/productos/*");
//		registrationBean.addUrlPatterns("/api/usuario/*");
//		return registrationBean;
//	}//jwtFilter

}//class
