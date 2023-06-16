package com.example.demo.Dao;

import java.util.List;

import com.example.demo.Model.ClassRoomDto;
import com.example.demo.Model.TeachingDto;

public interface ITeachingDao {
	public List<ClassRoomDto> getAllClassRoom(String idTeacher);
	
	public List<ClassRoomDto> getClassDontTeaching(String idTeacher);
	
	public void addClassTeacher(TeachingDto obj);
}
