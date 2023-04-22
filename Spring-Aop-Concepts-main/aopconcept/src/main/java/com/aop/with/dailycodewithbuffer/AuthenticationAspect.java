package com.aop.with.dailycodewithbuffer;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

//	@Pointcut("within(demo..*)")
	@Pointcut("within(com.aop.with.dailycodewithbuffer..*)")
	public void authenticatingPointCut() {

	}

	@Pointcut("within(com.aop.with.dailycodewithbuffer..*)")
	public void authorizationPointCut() {

	}

	@Before("authenticatingPointCut() && authorizationPointCut()") // we can also go with or or,||
	public void authenticate() {
		System.out.println("Authenticating the request");
	}
}
