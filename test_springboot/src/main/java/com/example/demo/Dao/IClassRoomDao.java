package com.example.demo.Dao;

import java.util.List;

import com.example.demo.Model.ClassRoomDto;

public interface IClassRoomDao {
	public int insertClassRoom(ClassRoomDto obj);
	
	public void updateClassRoom(ClassRoomDto obj);
	
	public List<ClassRoomDto> selectAll();
	
	public void deleteClassRoom(String id);
	
	public ClassRoomDto findById(String id);
	
	public ClassRoomDto findByName(String name);
	
	public List<ClassRoomDto> getAllClass(String id);
}
