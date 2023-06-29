package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.CourseDaoImpl;
import com.example.demo.Model.CourseDto;
@Service
public class CourseServiceImpl implements ICourseService {
	@Autowired
	CourseDaoImpl dao;
	
	@Override
	public List<CourseDto> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

}
