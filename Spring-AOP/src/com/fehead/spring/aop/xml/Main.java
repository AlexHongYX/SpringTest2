package com.fehead.spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AOPByXml.xml");
		
		ArithmeticCalculatorImp ac = (ArithmeticCalculatorImp) ctx.getBean("arithmeticCalculator");
		
		int result = ac.add(5, 6);
		System.out.println(result);
		
		result = ac.div(100, 10);
		System.out.println(result);
	}
}
