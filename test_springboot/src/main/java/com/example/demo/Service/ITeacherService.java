package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.TeacherDto;
@Service
public interface ITeacherService {
	@Autowired
	public List<TeacherDto> selectAll();

	@Autowired
	public void insertTeacher(TeacherDto obj);

	@Autowired
	public void updateTeacher(TeacherDto obj);
	
	@Autowired
	public void deleteTeacher(String id);
	
	@Autowired
	public TeacherDto findById(String id);
	
	@Autowired
	public List<TeacherDto> findByName(String name);
	
	@Autowired
	public List<String> selectID();
}
