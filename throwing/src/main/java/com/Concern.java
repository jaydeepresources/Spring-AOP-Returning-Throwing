package com;

import org.aspectj.lang.JoinPoint;

public class Concern {

	public void additionalTask(JoinPoint jp, Throwable error) {

		System.out.println("Executing additional task...");
		System.out.println("Method Signature: " + jp.getSignature());
		System.out.println("Exception from Operations: " + error);

	}
}