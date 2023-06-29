package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CourseDto;

@Service
public interface ICourseService {

	@Autowired
	List<CourseDto> selectAll();
	
}
