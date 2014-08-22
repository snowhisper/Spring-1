package com.Constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collection.Employee;

public class App1 {
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/Constructor/beans.xml");
		Employee employee = (Employee) ac.getBean("Employee");
	}
}
