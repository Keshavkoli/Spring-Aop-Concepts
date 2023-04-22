package before.advice.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* before.advice.example.EmployeeService.*(..))")
	public void logBeforeAllMethods(JoinPoint joinPoint) {
		LOGGER.debug("****LoggingAspect.logBeforeAllMethods() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* before.advice.example.EmployeeService.getEmployeeById(..))")
	public void logBeforeGetEmployee(JoinPoint joinPoint) {
		LOGGER.debug("****LoggingAspect.logBeforeGetEmployee() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* before.advice.example.EmployeeService.createEmployee(..))")
	public void logBeforeAddEmployee(JoinPoint joinPoint) {
		LOGGER.debug("****LoggingAspect.logBeforeCreateEmployee() : " + joinPoint.getSignature().getName());
	}
}
