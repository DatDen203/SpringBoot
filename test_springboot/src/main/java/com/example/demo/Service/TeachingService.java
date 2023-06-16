package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ClassRoomDaoImpl;
import com.example.demo.Dao.TeachingDaoImpl;
import com.example.demo.Model.ClassRoomDto;
import com.example.demo.Model.TeachingDto;
@Service
public class TeachingService implements ITeachingService {
	@Autowired
	private TeachingDaoImpl dao;
	
	@Autowired
	private ClassRoomDaoImpl daoClass;
	@Override
	public List<ClassRoomDto> getAllClass(String idTeacher) {
		return dao.getAllClassRoom(idTeacher);
	}
	@Override
	public List<ClassRoomDto> getClassDontTeaching(String idTeacher) {
		return dao.getClassDontTeaching(idTeacher);

	}
	@Override
	public void addClassTeacher(String nameClass, String idTeacher) {
		String idClass = daoClass.findByName(nameClass).getId();
		TeachingDto obj = new TeachingDto(idTeacher, idClass);
		dao.addClassTeacher(obj);
	}

}
