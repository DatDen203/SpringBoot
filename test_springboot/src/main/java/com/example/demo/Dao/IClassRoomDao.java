package com.example.demo.Dao;

import java.util.List;

import com.example.demo.Model.ClassRoomDto;

public interface IClassRoomDao {
	public int insert(ClassRoomDto obj);
	
	public void update(ClassRoomDto obj);
	
	public List<ClassRoomDto> GetListClass();
	
	public void delete(String id);
	
	public ClassRoomDto findById(String id);
	
	public ClassRoomDto findByName(String name);
	
	public List<ClassRoomDto> getAllClass(String id);
}
