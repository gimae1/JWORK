package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
//	//p182-183
//	public void exceptionLog() {
//		System.out.println("[예외 처리] 비즈니스 로직 수행 중 예외 발생");
//	}

	//p194-195
	public void exceptionLog(JoinPoint jp,Exception exceptObj) {
		String method = jp.getSignature().getName();
	System.out.println("[예외 처리]"
		+ method	+ " () 메소드 수행 중 발생된 예외 메세지 : " +exceptObj.getMessage());
	}
}
