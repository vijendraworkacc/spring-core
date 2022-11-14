package com.te.spring.core.beans;

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
		System.out.println("Bean() no-argument constructor called!");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		System.out.println("setA(int) called!");
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		System.out.println("setB(int) called!");
		this.b = b;
	}

	@Override
	public String toString() {
		return "Bean [a=" + a + ", b=" + b + "]";
	}

}
