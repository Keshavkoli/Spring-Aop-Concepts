package afterAdviceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("afterAdviceType/SpringCfg.xml");
//		System.out.println(":context:==>" + context);
		ShapeService shape = context.getBean("shapeBean", ShapeService.class);
//		System.out.println(":context:==>" + context);
		shape.getTriangle().setName("Keshav Here");
		// System.out.println("-------Triangle Name-------" +
		// shape.getTriangle().getName());
//		System.out.println(shape.getTriangle().getName());
		System.out.println("-------Circle Name---------" + shape.getCircle().getName());

	}

}
