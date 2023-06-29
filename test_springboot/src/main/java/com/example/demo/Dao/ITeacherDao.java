package com.example.demo.Dao;

import java.util.List;

import com.example.demo.Model.TeacherDto;

public interface ITeacherDao {
	public List<TeacherDto> selectAll();

	public int insertTeacher(TeacherDto obj);
	
	public TeacherDto findById(String ID);
	
	public List<TeacherDto> findByName(String name);

	public void updateTeacher(TeacherDto obj);
	
	public void deleteTeacher(String ID);
	
	public List<String> selectID();
	
//	public List<ClassRoomDto> getAllClass(String idTeacher);
}
