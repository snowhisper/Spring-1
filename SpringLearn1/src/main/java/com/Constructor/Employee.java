package com.Constructor;

public class Employee {
	private String name;
	private int age;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	 
}
