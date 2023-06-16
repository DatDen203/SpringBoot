package com.example.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Model.StudentDto;
@Mapper
public interface StudentDaoMapper {
	
	public List<StudentDto> GetListStudent();

	public int insert(StudentDto obj);
	
	public StudentDto findById(String ID);
	
	public StudentDto findByIdUser(String ID);
	
	public List<StudentDto> findByName(String name);

	public void update(StudentDto obj);
	
	public void delete(String ID);

}
