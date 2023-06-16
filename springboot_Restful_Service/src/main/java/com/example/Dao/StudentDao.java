package com.example.Dao;

import java.util.List;

import com.example.Dto.StudentDto;

public interface StudentDao {
	public List<StudentDto> selectAll();

	public void insert(StudentDto obj);

	public void update(StudentDto obj);

	public void delete(int id);

	public StudentDto findById(int id);
}
