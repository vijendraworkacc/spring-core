package com.te.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.spring.core.dto.Address;
import com.te.spring.core.dto.Student;

@Configuration
@ComponentScan(basePackages = "com.te.spring.core")
public class BeanConfig {
	
	@Bean("address01")
	public Address getAddress() {
		Address address = new Address();
		address.setAddressLine("Address 01");
		return address;
	}
	
	@Bean("address02")
	@Primary
	public Address getAddress2() {
		Address address = new Address();
		address.setAddressLine("Address 02");
		return address;
	}
	
	@Bean("student01")
	public Student getStudent() {
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("Name 01");
		return student;
	}
}
