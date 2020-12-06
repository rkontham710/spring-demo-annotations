package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class PractiseCoach implements Coach {

	@Autowired
	PractiseFortuneService practiseFortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practise Daily Workout";
	}

	@Override
	public String getDailyFortune() {
		return practiseFortuneService.getFortune();
	}

}
