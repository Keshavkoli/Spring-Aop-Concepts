package afterAdviceType;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspects {

	@AfterReturning("args(name)")
	public void allAfterReturningTest(String name) {
		System.out.println("allAfterReturningTest method---->" + name);
	}

	@After("args(name)")
	public void allAfterTest(String name) {
		System.out.println("allAfterTest method===>" + name);
	}

	@Before("allGetters()")
	public void loggingAdviceB() {
		System.out.println("@Before loggingAdviceB method...");
	}

	@AfterReturning(pointcut = "allGetters()")
	public void afterReturningAdvice() {
		System.out.println("--------pointcut = allGetters()------");
	}

	// note:-execute will take parameter as a methods.
	// @Pointcut("execution(public * get*())")
	@Pointcut("execution(public String getName())")
	public void allGetters() {
	}

}
