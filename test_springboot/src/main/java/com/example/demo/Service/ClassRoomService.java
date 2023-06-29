package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ClassRoomDaoImpl;
import com.example.demo.Dao.LearnDaoImpl;
import com.example.demo.Dao.StudentDaoImpl;
import com.example.demo.Model.ClassRoomDto;
import com.example.demo.Model.LearnDto;
import com.example.demo.Model.StudentDto;

@Service
public class ClassRoomService implements IClassRoomService{
	@Autowired
	private ClassRoomDaoImpl dao;
	@Autowired 
	private LearnDaoImpl daoLearn;
	@Autowired 
	private StudentDaoImpl daoStudent;
	
	public List<ClassRoomDto> selectAll(){
		return dao.selectAll();
	}

	public void deleteClassRoom(String id) {
		dao.deleteClassRoom(id);
	}

	public ClassRoomDto findById(String id) {
		return dao.findById(id);
	}

	@Override
	public List<ClassRoomDto> findClassOfOneStudent(String id) {
		String idStudent = daoStudent.findByIdUser(id).getID();
		List<String> idClassOfStudent = new ArrayList<>();
		List<LearnDto> listClass = daoLearn.getClassOfOneStudent(idStudent);
		for(LearnDto x : listClass) {
			idClassOfStudent.add(x.getId_classroom());
		}
				
		List<ClassRoomDto> classOfStudent = new ArrayList<>();
		for(String x : idClassOfStudent) {
			classOfStudent.add(dao.findById(x));
		}
		return classOfStudent;
	}

	@Override
	public int insertClassRoom(ClassRoomDto obj) {
		// TODO Auto-generated method stub
		return dao.insertClassRoom(obj);
	}

	@Override
	public void updateClassRoom(ClassRoomDto obj) {
		// TODO Auto-generated method stub
		dao.updateClassRoom(obj);
	}

	@Override
	public List<StudentDto> gelAllStudentOneClass(String idClass) {
		List<String> idStudentOfClass = new ArrayList<>();
		List<LearnDto> listLearn = daoLearn.getAllStudentOneClass(idClass);
		for(LearnDto x : listLearn) {
			idStudentOfClass.add(x.getId_student());
		}
		
		List<StudentDto> studentOfClass = new ArrayList<>();
		for(String x : idStudentOfClass) {
			studentOfClass.add(daoStudent.findById(x));
		}
		return studentOfClass;
	}


}
