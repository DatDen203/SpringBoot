package com.example.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Model.ClassRoomDto;
import com.example.demo.Model.TeachingDto;

@Mapper
public interface TeachingDaoMapper {
	public List<ClassRoomDto> getAllClassRoom(String idTeacher);

	public List<ClassRoomDto> getClassDontTeaching(String idTeacher);

	public void addClassTeacher(TeachingDto obj);
}
