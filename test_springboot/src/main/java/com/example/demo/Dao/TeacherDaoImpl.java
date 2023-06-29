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
	public List<TeacherDto> selectAll() {
		// TODO Auto-generated method stub
		return teacherDaoMapper.selectAll();
	}

	@Override
	public int insertTeacher(TeacherDto obj) {
		// TODO Auto-generated method stub
		return teacherDaoMapper.insertTeacher(obj);
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
	public void updateTeacher(TeacherDto obj) {
		// TODO Auto-generated method stub
		teacherDaoMapper.updateTeacher(obj);
	}

	@Override
	public void deleteTeacher(String ID) {
		// TODO Auto-generated method stub
		teacherDaoMapper.deleteTeacher(ID);
	}

	@Override
	public List<String> selectID() {
		// TODO Auto-generated method stub
		return teacherDaoMapper.selectID();
	}
	
}
