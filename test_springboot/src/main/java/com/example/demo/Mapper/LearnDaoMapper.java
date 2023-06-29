package com.example.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Model.LearnDto;

@Mapper
public interface LearnDaoMapper {
	
	public List<LearnDto> getClassOfOneStudent(String id);
	
	public List<LearnDto> gelAllStudentOneClass(String id);
}
