package com.te.spring.core.dto;

public class Ambiguity {
	/*
	 * In case of constructor based dependency injection if our class contains
	 * multiple constructors with different types and same number of arguments then
	 * spring framework cause the constructor injection argument type ambiguities
	 * issue.
	 * 
	 * We can get org.springframework.beans.factory.UnsatisfiedDependencyException exception.
	 * 
	 * 1. We have to specify the constructor argument’s data types using type attribute. 
	 * 2. We have to use index attribute to specify the index of constructor arguments.
	 * 
	 */
	private int x;
	private int y;

	public Ambiguity() {
		super();
		System.out.println("-> Ambiguity()");
	}

	public Ambiguity(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("-> Ambiguity(int x, int y)");
	}

	public Ambiguity(double x, double y) {
		super();
		this.x = (int) x;
		this.y = (int) y;
		System.out.println("-> Ambiguity(double x, double y)");
	}

	public Ambiguity(String x, String y) {
		super();
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		System.out.println("-> Ambiguity(String x, String y)");
	}
	
	public Ambiguity(int x, double y) {
		super();
		this.x = x;
		this.y = (int) y;
		System.out.println("-> Ambiguity(int x, double y)");
	}
	
	public Ambiguity(double x, int y) {
		super();
		this.x = (int) x;
		this.y = y;
		System.out.println("-> Ambiguity(double x, int y)");
	}
	
	@Override
	public String toString() {
		return "Ambiguity [x=" + x + ", y=" + y + "]";
	}
}
