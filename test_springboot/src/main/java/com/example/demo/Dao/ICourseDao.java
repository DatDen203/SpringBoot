package com.example.demo.Dao;

import java.util.List;

import com.example.demo.Model.CourseDto;

public interface ICourseDao {
	List<CourseDto> selectAll();
}
