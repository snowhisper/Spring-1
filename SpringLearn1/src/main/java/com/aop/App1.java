package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/aop/beans.xml");
		//调用原始类
		Test1Service ts = (Test1Service) ac.getBean("test1Service");
		ts.sayhello();
		//调用代理对象，引用接口
		TestServiceInter tst = (TestServiceInter) ac.getBean("ProxyFactoryBean");
		tst.sayhello();
		((TestServiceInter2) tst).sayByeBye();
		
	}
}
