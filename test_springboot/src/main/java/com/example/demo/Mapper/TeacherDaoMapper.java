package com.example.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Model.TeacherDto;
@Mapper
public interface TeacherDaoMapper {
	public List<TeacherDto> GetListTeacher();

	public int insert(TeacherDto obj);
	
	public TeacherDto findById(String ID);
	
	public List<TeacherDto> findByName(String name);

	public void update(TeacherDto obj);
	
	public void delete(String ID);
	
	public List<String> getAllID();
	
//	public List<ClassRoomDto> getAllClass(String idTeacher);
}
