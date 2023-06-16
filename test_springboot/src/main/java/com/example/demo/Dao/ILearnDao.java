package com.example.demo.Dao;

import java.util.List;

import com.example.demo.Model.LearnDto;


public interface ILearnDao {
	
	public List<LearnDto> getClassOfOneStudent(String id);
	
	public List<LearnDto> getAllStudentOneClass(String id);
}
