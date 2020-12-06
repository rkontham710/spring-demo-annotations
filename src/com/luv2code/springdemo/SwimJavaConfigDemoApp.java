package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Coach coach = context.getBean("swimCoach",Coach.class);
		
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		
		System.out.println(coach.getEmail());
		System.out.println(coach.getProjectName());
		
		context.close();

	}

}
