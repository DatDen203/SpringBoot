package com.example.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.Dto.StudentDto;

@Mapper
public interface StudentMapper {
	public List<StudentDto> selectAll();

	public void insert(StudentDto obj);

	public void update(StudentDto obj);

	public void delete(int id);

	public StudentDto findById(int id);
}
