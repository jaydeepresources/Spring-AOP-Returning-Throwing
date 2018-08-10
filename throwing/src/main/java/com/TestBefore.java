package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBefore {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		Operations e = (Operations) context.getBean("operation");

		try {
			e.task1();
		} catch (Exception e1) {
			System.out.println("main's catch");
			e1.printStackTrace();
		}

	}
}
