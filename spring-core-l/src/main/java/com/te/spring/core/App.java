package com.te.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.dto.Student;

public class App {
	/*
	 * Autowiring
	 * 
	 * 1. Autowiring is the feature of Spring framework in which spring container
	 * injects the dependencies automatically.
	 * 
	 * 2. Autowiring cannot be used for primitive types and String types, it works
	 * only for reference types.
	 * 
	 * Before we used to make use of "ref" attribute present in the property tag,
	 * now in case of autowiring, IoC container will automatically find the
	 * dependencies byTpe, byName or some other way.
	 * 
	 * Autowiring can be done through
	 * 1. XML file
	 * 2. Annotations (@Autowired)
	 * 
	 * Here in this project we will be using annotations for autowiring - @Autowired
	 * 
	 * In this project we will make use of @Autowired, there are 3 ways of using autowiring
	 * 1. We can use @Autowired on setter methods
	 * 2. We can use @Autowired on the variable/ property
	 * 3. We can use @Autowired on constructor
	 * 
	 * Here we are using @Autowired on constructor
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "beans-config.xml" });
		Student student01 = (Student) applicationContext.getBean("student01");
		System.out.println(student01);
	}
}
