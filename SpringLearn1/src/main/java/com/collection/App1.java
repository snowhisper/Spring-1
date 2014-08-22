
package com.collection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Department department=(Department) ac.getBean("department");
		System.out.println(department.getName());
		
		for(String s:department.getEmpName()){
			System.out.println(s);
		}
		
		System.out.println("********************");

		for(Employee s:department.getEmpList()){
			System.out.println(s.getName());
		}
	}
	
	
	
	
}
