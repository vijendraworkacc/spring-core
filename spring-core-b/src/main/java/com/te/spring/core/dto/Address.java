package com.te.spring.core.dto;

public class Address {
	private int houseNo;
	private String addressLine01;

	public Address(int houseNo, String addressLine01) {
		super();
		this.houseNo = houseNo;
		this.addressLine01 = addressLine01;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", addressLine01=" + addressLine01 + "]";
	}

}
