package com.te.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.dto.Ambiguity;
import com.te.spring.core.dto.Student;

public class App02 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "beans-config.xml" });
		Ambiguity ambiguity = (Ambiguity) applicationContext.getBean("ambiguity");
		Ambiguity ambiguity02 = (Ambiguity) applicationContext.getBean("ambiguity02");
		Ambiguity ambiguity03 = (Ambiguity) applicationContext.getBean("ambiguity03");
		Ambiguity ambiguity04 = (Ambiguity) applicationContext.getBean("ambiguity04");
		System.out.println(ambiguity);
		System.out.println(ambiguity02);
		System.out.println(ambiguity03);
		System.out.println(ambiguity04);
	}
}
