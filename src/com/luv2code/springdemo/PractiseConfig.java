package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PractiseConfig {

	@Bean
	public PractiseCoach practiseCoach() {
		return new PractiseCoach();
	}
	
	@Bean
	public PractiseFortuneService practiseFortuneService() {
		return new PractiseFortuneService();
	}
}
