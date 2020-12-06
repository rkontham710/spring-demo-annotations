package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Do Daily Workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
