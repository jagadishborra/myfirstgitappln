package com.git.demo.controller;

import com.git.demo.util.Student;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
public class GitController {

	@GetMapping(path = "/getStudentInfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getStudentInfo() {
		Student student = new Student("1", "jaagu123", "31", "male", "testing","jagguFather","sanMother");

		return student;
	}

}
