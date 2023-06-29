package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ClassRoomDto;
import com.example.demo.Model.StudentDto;

@Service
public interface IClassRoomService {
	@Autowired
	public List<ClassRoomDto> selectAll();
	
	@Autowired
	public int insertClassRoom(ClassRoomDto obj);
	
	@Autowired
	public void updateClassRoom(ClassRoomDto obj);
	
	@Autowired
	public void deleteClassRoom(String id);
	
	@Autowired
	public ClassRoomDto findById(String id);
	
	@Autowired
	public List<ClassRoomDto> findClassOfOneStudent(String id);
	
	@Autowired
	public List<StudentDto> gelAllStudentOneClass(String idClass);
	
	
}
