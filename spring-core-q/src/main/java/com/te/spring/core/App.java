package com.te.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;

import com.te.spring.core.config.BeanConfig;
import com.te.spring.core.dto.Student;

public class App {
	/*
	 * @Autowired, @Configuration, @ComponentScan, @Bean, @Primary, @Qualifier
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		Student student01 = (Student) applicationContext.getBean("student01");
		System.out.println(student01);
	}
}
