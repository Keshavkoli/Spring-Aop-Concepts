package com.aop.with.dailycodewithbuffer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	// this is a point cut
	// simple thing we want to understand is
	// 1) what is something we want to call and 2)where we want to call just need to
	// define this 2 things

	@Before("execution(* com.aop.with.dailycodewithbuffer.ShoppingCart.checkout())")
	public void beforelogger(JoinPoint jp) {
		System.out.println(jp.getSignature());// JointPoint inside the method printed the JoinPoint
		System.out.println("Before Loggers");
	}

	// the below pattern is like for any return type, for any package and for any
	// class if there is a any checkout method then we need to run this particular
	// method
	// @After("execution(* *.*.checkout())")
	@After("execution(* com.aop.with.dailycodewithbuffer.ShoppingCart.checkout())")
	public void afterlogger() {
		System.out.println("After Logger");
	}

	@Before("execution(* com.aop.with.dailycodewithbuffer.ShoppingCart.possible(..))") // the two dots inside the (..)
																						// indicates the method
																						// parameter
	public void beforepossiblelogger(JoinPoint jp) {
		String arg = jp.getArgs()[0].toString();
		System.out.println("Before Loggers with Arguments :" + arg);// got the argument for that method
		System.out.println("Before Loggers");
	}

	@After("execution(* com.aop.with.dailycodewithbuffer.ShoppingCart.possible(..))")
	public void afterpossiblelogger() {
		System.out.println("After Logger");
	}

	@Pointcut("execution(* com.aop.with.dailycodewithbuffer.ShoppingCart.quantity(..))")
	public void afterReturingPointCut() {

	}

	@AfterReturning(pointcut = "afterReturingPointCut()", returning = "retVal")
	public void afterReturing(String retVal) {
		System.out.println("After Returing : " + retVal);
	}
}
