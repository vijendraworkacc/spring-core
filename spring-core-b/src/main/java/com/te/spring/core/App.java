package com.te.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.dto.Student;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "beans-config.xml" });
		Student student01 = (Student) applicationContext.getBean("student01");
		Student student02 = (Student) applicationContext.getBean("student02");
		Student student03 = (Student) applicationContext.getBean("student03");
		System.out.println(student01);
		System.out.println(student02);
		System.out.println(student03);
	}
}
