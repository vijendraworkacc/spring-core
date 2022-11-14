package com.te.spring.core.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bean {
	private int a;
	private int b;
	private List<String> list;
	private Set<String> set;
	private Map<Integer, String> map;

	public Bean() {
		super();
	}

	public Bean(int a, int b, List<String> list, Set<String> set, Map<Integer, String> map) {
		super();
		this.a = a;
		this.b = b;
		this.list = list;
		this.set = set;
		this.map = map;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Bean [a=" + a + ", b=" + b + ", list=" + list + ", set=" + set + ", map=" + map + "]";
	}

}
