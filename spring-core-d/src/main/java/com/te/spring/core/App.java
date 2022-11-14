package com.te.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.dto.Bean;

public class App {
	/*
	 * Life cycle methods
	 * 
	 * Spring provides two important methods to every bean
	 * 
	 * 1. public void init(); --> Name of the method is changeable, but must be a
	 * public void no-argument method. This method is used for initialization,
	 * loading configurations, connecting to database and web services.
	 * 
	 * 2. public void destroy(); --> Name of the method is changeable, but must be a
	 * public void no-argument method. This method is used to execute the clean-up
	 * code and destroy the object.
	 * 
	 * 
	 * Life cycle of Spring bean
	 * 1. IoC container starts
	 * 
	 * 1. Bean instantiation
	 * 
	 * 2. Instantiate the bean 
	 * 
	 * 3. Dependency injected 
	 * 
	 * 4. init() method called
	 * 
	 * 5. Utility method called
	 * 
	 * 6. destroy() method called
	 * 
	 * 
	 * Configuration technique
	 * 1. XML
	 * 2. Spring interfaces
	 * 3. Java annotations
	 * 
	 * Now we are using XML configuration for init() and destroy() method!
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "beans-config.xml" });
		applicationContext.registerShutdownHook();
		Bean bean01 = (Bean) applicationContext.getBean("bean01");
		System.out.println(bean01);
		// applicationContext.close();
	}
}
