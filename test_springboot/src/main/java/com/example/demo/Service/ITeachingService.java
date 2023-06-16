package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.ClassRoomDto;
@Service
public interface ITeachingService {
	public List<ClassRoomDto> getAllClass(String idTeacher);
	
	public List<ClassRoomDto> getClassDontTeaching(String idTeacher);
	
	public void addClassTeacher(String nameClass, String idTeacher);
}
