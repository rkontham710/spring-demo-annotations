package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "C:\\foo\\fortune-data.txt";
	private List<String> todayFortune;
	
	private Random myRandom = new Random();
	
	public FileFortuneService() {
		
		todayFortune = new ArrayList<String>();
		File file = new File(fileName);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String tempLine;
			
			while((tempLine=br.readLine()) != null) {
				todayFortune.add(tempLine);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String getFortune() {
		return todayFortune.get(myRandom.nextInt(todayFortune.size()));
	}

}
