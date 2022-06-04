package com.spring.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Sim sim=context.getBean("sim",Sim.class);
		sim.calling();
		sim.sms();
		
		// Code by suyash
		System.out.println("---------------------------------------------");
		Jio j = (Jio) context.getBean("jiosim");
		Jio.jiodiscripter();
		j.calling();
		j.sms();
		
	}

}
