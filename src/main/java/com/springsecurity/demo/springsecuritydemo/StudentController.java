/**
 * 
 */
package com.springsecurity.demo.springsecuritydemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sumanth
 *
 */

@RestController
public class StudentController {
	
	public final List<Student> students = Arrays.asList(
			new Student("Sumanth", "111"),
			new Student("Naidu", "112"),
			new Student("Ashok", "113")
			);
	@GetMapping("/hello")
	public String hello() {
		return "Hello Sumanth";
	}
	
	@GetMapping("/api/v1/students/{rollNumber}")
	public Student getStudentDetails(@PathVariable("rollNumber") String rollNumber) {
		return students.stream().
				filter(student -> rollNumber.equalsIgnoreCase(student.getRollNumber()))
				.findFirst()
				.orElseThrow(()-> new IllegalArgumentException("Student Rollumber is not found"));
	}

}
