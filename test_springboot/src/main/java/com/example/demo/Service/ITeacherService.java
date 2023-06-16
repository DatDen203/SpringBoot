package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.TeacherDto;
@Service
public interface ITeacherService {
	@Autowired
	public List<TeacherDto> GetListTeacher();

	@Autowired
	public void insert(TeacherDto obj);

	@Autowired
	public void update(TeacherDto obj);
	
	@Autowired
	public void delete(String id);
	
	@Autowired
	public TeacherDto findById(String id);
	
	@Autowired
	public List<TeacherDto> findByName(String name);
	
	@Autowired
	public List<String> getAllID();
}
