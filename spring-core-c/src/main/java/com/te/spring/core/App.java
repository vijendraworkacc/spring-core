package com.te.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.dto.Main;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "beans-config.xml" });
		Main mainBean = (Main) applicationContext.getBean("mainBean");
		Main mainBean02 = (Main) applicationContext.getBean("mainBean02");
		System.out.println("Attribute of Main: " + mainBean.getMainAttribute01());
		System.out.println("Attribute of Dependency01: " + mainBean.getDependency01().getAttribute01());
		System.out.println("Complete Main object: " + mainBean);
		System.out.println("Complete Main object: " + mainBean02);
	}
}
