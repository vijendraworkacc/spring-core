package com.te.spring.core.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean {
	private int a;
	private int b;

	public Bean(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Bean(int, int) constructor called!");
	}

	public Bean() {
		super();
		System.out.println("Bean() constructor called!");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		System.out.println("Setting 'a' value!");
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		System.out.println("Setting 'b' value!");
		this.b = b;
	}

	@Override
	public String toString() {
		return "Bean [a=" + a + ", b=" + b + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("start() method called!");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("end() method called!");
	}
}
