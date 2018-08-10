package com;

import org.aspectj.lang.JoinPoint;

public class Concern {

	public void additionalTask(JoinPoint jp, Object result) {
		
		System.out.println("Executing additional task...");
		System.out.println("Method Signature: " + jp.getSignature());
		System.out.println("Result from Operations: " + result);

	}

}
