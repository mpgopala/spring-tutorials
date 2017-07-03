package com.springtutorial.helloworld;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		System.out.println(objA.getMessage1());
		System.out.println(objA.getMessage2());

		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		System.out.println(objB.getMessage1());
		System.out.println(objB.getMessage2());
		System.out.println(objB.getMessage3());	
		
		//DI
		TextEditor te = (TextEditor) context.getBean("textEditor");
	    te.spellCheck();
		
	    //Collections
	    JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();
		
		
		context.registerShutdownHook();
		context.close();
	}
}
