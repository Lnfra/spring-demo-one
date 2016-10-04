package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container with the beanId and the interface
		Coach theCoach = context.getBean("trackCoach", Coach.class); 
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call the new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
