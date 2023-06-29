package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CourseDto;
import com.example.demo.Service.CourseServiceImpl;

@RestController
public class CourseController {
	@Autowired
	CourseServiceImpl service;
	
	@GetMapping("course")
	public List<CourseDto> selectAll(){
		return service.selectAll();
	}
	
}
