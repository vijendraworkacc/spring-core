package com.te.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.dto.Bean;

public class App {
	/* Bean life cycle
	 * 
	 * Configuration technique 
	 * 
	 * 1. XML 
	 * 
	 * 2. Spring interfaces 
	 * 
	 * 3. Java annotations
	 * 
	 * Now we are using Java annotations!
	 * 
	 * Here we will be using @PostConstruct and @PreDestroy  
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "beans-config.xml" });
		applicationContext.registerShutdownHook();
		Bean bean01 = (Bean) applicationContext.getBean("bean01");
		System.out.println(bean01);
		// applicationContext.close();
	}
}
