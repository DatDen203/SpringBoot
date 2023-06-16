package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Mapper.TeacherDaoMapper;
import com.example.demo.Model.TeacherDto;

@Repository
public class TeacherDaoImpl implements ITeacherDao {

	@Autowired
	private TeacherDaoMapper teacherDaoMapper;
	
	@Override
	public List<TeacherDto> GetListTeacher() {
		// TODO Auto-generated method stub
		return teacherDaoMapper.GetListTeacher();
	}

	@Override
	public int insert(TeacherDto obj) {
		// TODO Auto-generated method stub
		return teacherDaoMapper.insert(obj);
	}

	@Override
	public TeacherDto findById(String ID) {
		// TODO Auto-generated method stub
		return teacherDaoMapper.findById(ID);
	}

	@Override
	public List<TeacherDto> findByName(String name) {
		// TODO Auto-generated method stub
		return teacherDaoMapper.findByName(name);
	}

	@Override
	public void update(TeacherDto obj) {
		// TODO Auto-generated method stub
		teacherDaoMapper.update(obj);
	}

	@Override
	public void delete(String ID) {
		// TODO Auto-generated method stub
		teacherDaoMapper.delete(ID);
	}

	@Override
	public List<String> getAllID() {
		// TODO Auto-generated method stub
		return teacherDaoMapper.getAllID();
	}
	
}
