package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Mapper2.CourseMapper;
import com.example.demo.Model.CourseDto;

@Repository
public class CourseDaoImpl implements ICourseDao {
	@Autowired
	CourseMapper mapper;
	
	@Override
	public List<CourseDto> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

}
