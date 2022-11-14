package com.te.spring.core.beans;

public class Student {
	private String sId;
	private String sName;
	private long sNumber;

	public Student() {
		super();
	}

	public Student(String sId, String sName, long sNumber) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sNumber = sNumber;
	}
	
//	public Student(String sName, String sId) {
//		super();
//		this.sId = sId;
//		this.sName = sName;
//		this.sNumber = sNumber;
//	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public long getsNumber() {
		return sNumber;
	}

	public void setsNumber(long sNumber) {
		this.sNumber = sNumber;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sNumber=" + sNumber + "]";
	}
}
