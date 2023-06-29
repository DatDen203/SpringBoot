package com.example.demo.Mapper2;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.Model.CourseDto;

@Mapper
public interface CourseMapper {
	
/*	@Select("select * from course")*/
	public List<CourseDto> selectAll();
	
}
