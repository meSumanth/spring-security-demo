/**
 * 
 */
package com.springsecurity.demo.springsecuritydemo;

/**
 * @author Sumanth
 *
 */
public class Student {
	
	private String name;
	
	private String rollNumber;
	
	public Student(String name, String rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	
}
