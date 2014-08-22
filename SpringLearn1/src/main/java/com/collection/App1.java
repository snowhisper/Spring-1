package com.collection;

import java.util.Map.Entry;
import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.parsing.ParseState;
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
		System.out.println("********************");

		for(Entry<String,Employee> e : department.getEmpMaps().entrySet()){
			
			System.out.println(e.getKey()+"+"+e.getValue().getName()+"+"+e.getValue().getId());
		}
		
		System.out.println("********************");
		Properties pp = department.getPp();
//		System.out.println(pp.get("pp1")+"");
		for(Entry<Object,Object> entry:pp.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
