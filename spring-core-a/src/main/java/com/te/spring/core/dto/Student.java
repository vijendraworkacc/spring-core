package com.te.spring.core.dto;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private List<String> studentCources;
	private Set<String> studentTeachers;
	private Map<String, String> studentMarks;
	private Properties studentProperties;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String studentAddress, List<String> studentCources,
			Set<String> studentTeachers, Map<String, String> studentMarks, Properties studentProperties) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentCources = studentCources;
		this.studentTeachers = studentTeachers;
		this.studentMarks = studentMarks;
		this.studentProperties = studentProperties;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("setStudentId method called!");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setStudentName method called!");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("studentAddress method called!");
		this.studentAddress = studentAddress;
	}

	public List<String> getStudentCources() {
		return studentCources;
	}

	public void setStudentCources(List<String> studentCources) {
		this.studentCources = studentCources;
	}

	public Set<String> getStudentTeachers() {
		return studentTeachers;
	}

	public void setStudentTeachers(Set<String> studentTeachers) {
		this.studentTeachers = studentTeachers;
	}

	public Map<String, String> getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(Map<String, String> studentMarks) {
		this.studentMarks = studentMarks;
	}

	public Properties getStudentProperties() {
		return studentProperties;
	}

	public void setStudentProperties(Properties studentProperties) {
		this.studentProperties = studentProperties;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentCources=" + studentCources + ", studentTeachers=" + studentTeachers + ", studentMarks="
				+ studentMarks + ", studentProperties=" + studentProperties + "]";
	}

}
