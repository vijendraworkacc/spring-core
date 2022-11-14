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
	 * Here in this project we will be using XML file for autowiring
	 * 
	 * There are several modes of autowiring 
	 * 1. no - that simply means autowiring is not enabled
	 * 2. byName - that means autowire based of the name of the bean
	 * 3. byType - that means autowire based on the type of the bean
	 * 4. constructor - injecting the dependency by calling the constructor
	 * 5. autodetect - deprecated since Spring 3
	 * 
	 * Advantage of autowiring
	 * 1. automatic
	 * 2. less code
	 * 
	 * Disadvantage of autowiring
	 * 1. No control of programmer
	 * 2. It cannot be used for String and primitive type values
	 * 
	 * Using byType 
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "beans-config.xml" });
		Student student01 = (Student) applicationContext.getBean("student01");
		System.out.println(student01);
	}
}
