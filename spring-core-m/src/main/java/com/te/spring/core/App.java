package com.te.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.dto.Student;

public class App {
	/*
	 * @Autowired and @Qualifier
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "beans-config.xml" });
		Student student01 = (Student) applicationContext.getBean("student01");
		System.out.println(student01);
	}
}
