package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${ravi.email}")
	private String email;
	@Value("${ravi.project}")
	private String projectName;
	
	public SwimCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim Coach Daily Workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
