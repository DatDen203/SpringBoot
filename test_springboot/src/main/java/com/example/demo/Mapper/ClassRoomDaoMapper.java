package com.example.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Model.ClassRoomDto;

@Mapper
public interface ClassRoomDaoMapper {
	public int insertClassRoom(ClassRoomDto obj);
	
	public void updateClassRoom (ClassRoomDto obj);
	
	public List<ClassRoomDto> selectAll();
	
	public void deleteClassRoom(String id);
	
	public ClassRoomDto findById(String id);
	
	public ClassRoomDto findByName(String name);
	
	public List<ClassRoomDto> getAllClass(String id);
}
