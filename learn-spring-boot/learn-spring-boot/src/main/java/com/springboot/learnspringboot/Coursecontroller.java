package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/courses
//courses
//course: id,name,author

@RestController
public class Coursecontroller {

	// courses
	// course: id,name,author

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(new Course(1, "learn AWS", "Effigo"), new Course(2, "learn DevOps", "Effigo"),
				new Course(3, "learn Azure", "Effigo"));
	}

}
