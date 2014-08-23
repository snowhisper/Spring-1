package com.autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collection.Employee;

public class App1 {
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/autowire/beans.xml");
		Master master = (Master) ac.getBean("master");
		System.out.println(master.getDog());
	}
}
