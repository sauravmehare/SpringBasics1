package com.spring.code;

public class Airtel implements Sim {
	public Airtel() {
		System.out.println("Hello I am AIrtel Constructor");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("I am calling from Airtel");

	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("I am massaging from Airtel");

	}

}
