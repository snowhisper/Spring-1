package com.inherit;

import java.util.Map.Entry;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collection.Department;
import com.collection.Employee;

public class App1 {
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/inherit/beans.xml");
		Graduate graduate = (Graduate) ac.getBean("grdate");
		System.out.println(graduate.getName()+" "+graduate.getAge()+" "+graduate.getDegree());
	}
}
