package com.fehead.spring.aop.xml;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class LoggingAspect {
	
	
	public void declareJointPointExpression(){}
		
	public void beforeMethod(){
		System.out.println("The method begins");
	}
	

	public void afterMethod(){
		System.out.println("The method ends");
	}

}
