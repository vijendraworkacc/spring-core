package com.te.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.dto.Student;

public class App {
	/*
	 * @Scope
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "beans-config.xml" });
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student.hashCode());
		Student student_ = (Student) applicationContext.getBean("student");
		System.out.println(student_.hashCode());
	}
}
