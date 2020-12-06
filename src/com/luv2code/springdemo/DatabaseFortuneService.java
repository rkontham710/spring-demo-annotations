package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Database Fortune For You";
	}

}
