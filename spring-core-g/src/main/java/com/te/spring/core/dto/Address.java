package com.te.spring.core.dto;

public class Address {
	private String addressLine;

	public Address() {
		super();
	}

	public Address(String addressLine) {
		super();
		this.addressLine = addressLine;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + "]";
	}
}
