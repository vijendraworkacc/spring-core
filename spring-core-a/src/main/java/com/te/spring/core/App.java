package com.te.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.dto.Student;

public class App {
	/*
	 * 1. Student student01 = applicationContext.getBean(Student.class);
	 * 
	 * If we have only one bean in the xml file for a bean class, then we need not
	 * specify the name of the bean as a String in getBean() method, just specifying
	 * the ClassName.class will be enough.
	 * 
	 * 2. If we have multiple beans in the xml file with different names, then we
	 * should not provide ClassName.class in the getBean() method or else we will
	 * get NoUniqueBeanDefinitionException exception.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "beans-config.xml" });
		// Student student01 = applicationContext.getBean(Student.class);
		Student student01 = (Student) applicationContext.getBean("student01");
		Student student02 = (Student) applicationContext.getBean("student02");
		Student student03 = (Student) applicationContext.getBean("student03");
		Student student04 = (Student) applicationContext.getBean("student04");
		System.out.println(student01);
		System.out.println(student01);
		System.out.println(student02);
		System.out.println(student03);
		System.out.println(student04);
	}
}
