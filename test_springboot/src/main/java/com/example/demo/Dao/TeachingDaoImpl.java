package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Mapper.TeachingDaoMapper;
import com.example.demo.Model.ClassRoomDto;
import com.example.demo.Model.TeachingDto;
@Repository
public class TeachingDaoImpl implements ITeachingDao {

	@Autowired
	private TeachingDaoMapper teachingDaoMapper;
	
	@Override
	public List<ClassRoomDto> getAllClassRoom(String idTeacher) {
		// TODO Auto-generated method stub
		return teachingDaoMapper.getAllClassRoom(idTeacher);
	}

	@Override
	public List<ClassRoomDto> getClassDontTeaching(String idTeacher) {
		// TODO Auto-generated method stub
		return teachingDaoMapper.getClassDontTeaching(idTeacher);
	}

	@Override
	public void addClassTeacher(TeachingDto obj) {
		// TODO Auto-generated method stub
		teachingDaoMapper.addClassTeacher(obj);
	}


}
