package com.springbook.biz.common;

import org.aopalliance.intercept.Joinpoint;
//p199-211
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
//p202
import org.aspectj.lang.annotation.Before;
//p203
import org.aspectj.lang.annotation.Aspect;

@Service
@Aspect// Aspect = Pointcut + Advice//p203
public class LogAdvice {
//	//p151-153
//		public void printLog() {
//			System.out.println("[공통로그 ]비즈니스 로직 수행 전 동작");
//				}
//p190-191	
//	public void printLog(Joinpoint jp) {
//		System.out.println("[공통로그 ]비즈니스 로직 수행 전 동작");
//			}
//p199-211
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPintcut() {}
	
//	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
//	public void getPintcut() {}
	//p202
	@Before("allPointcut()")
	public void printLog() {
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
	}
	
	
	
}
