package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	String[] fortunes = {"This is a good day!", "This day is normal!", "This day is better!"};
	Random generator = new Random();
	
	@Override
	public String getFortune() {
		int random = generator.nextInt(fortunes.length);
		return fortunes[random];
	}

}
