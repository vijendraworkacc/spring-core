package com.te.spring.core.dto;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAge;
	private Address studentAddress;

	public Student(String studentName, String studentAge, int studentId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public Student(String studentName, int studentId, String studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public Student(int studentId, String studentName, String studentAge, Address studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentAddress=" + studentAddress + "]";
	}

}
