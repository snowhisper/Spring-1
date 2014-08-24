package com.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
	
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("**********************");
		System.out.println("记录日志 "+method.getName());
		
	}

}
