package com.git.demo.util;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ConfigurationProperties(prefix = "Student")
public class Student {
	
	private String studentId;
	private String name;
	private String age;
	private String gender;
	private String schooolName;
	private String motherName;

}
