package com.aop;

public class Test1Service implements TestServiceInter ,TestServiceInter2{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayhello() {
		System.out.println("Hi "+name);
	}

	@Override
	public void sayByeBye() {
		System.out.println("Bye "+name);
		
	}
	
}
