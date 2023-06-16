package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dto.StudentDto;

@Service
public interface StudentService {
	@Autowired
	public List<StudentDto> selectAll();

	@Autowired
	public void insert(StudentDto obj);

	@Autowired
	public void update(StudentDto obj);

	@Autowired
	public void delete(int id);

	@Autowired
	public StudentDto findbyId(int id);
}
