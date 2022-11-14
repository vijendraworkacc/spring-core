package com.te.spring.core.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Address 01")
	private String addressLine;

	public Address() {
		super();
	}

	public Address(String addressLine) {
		super();
		this.addressLine = addressLine;
		System.out.println("Address(String addressLine) constructor called!");
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
