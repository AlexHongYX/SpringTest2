package com.fehead.spring.aop.impl;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Pointcut("execution(public int com.fehead.spring.aop.impl.ArithmeticCalculatorImp.*(..))")
	public void declareJointPointExpression(){}
	
	//�ڷ���ִ��ǰ
	@Before("declareJointPointExpression()")
	public void beforeMethod(){
		System.out.println("The method begins");
	}
	
	//�ڷ���ִ�к�
	@After("declareJointPointExpression()")
	public void afterMethod(){
		System.out.println("The method ends");
	}

}
