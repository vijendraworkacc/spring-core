package com.te.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.spring.core.config.BeanConfig;
import com.te.spring.core.dto.Student;

public class App {
	/*
	 * @Autowired, @Component, @Value, @Configuration, @ComponentScan
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student);
	}
}
