package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.TeacherDaoImpl;
import com.example.demo.Model.TeacherDto;

@Service
public class TeacherService implements ITeacherService {
	@Autowired
	private TeacherDaoImpl dao;

	@Override
	public List<TeacherDto> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public void insertTeacher(TeacherDto obj) {
		// TODO Auto-generated method stub
		dao.insertTeacher(obj);

	}

	@Override
	public void updateTeacher(TeacherDto obj) {
		// TODO Auto-generated method stub
		dao.updateTeacher(obj);

	}

	@Override
	public void deleteTeacher(String id) {
		// TODO Auto-generated method stub
		dao.deleteTeacher(id);

	}

	@Override
	public TeacherDto findById(String id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<TeacherDto> findByName(String name) {
		// TODO Auto-generated method stub
		return dao.findByName(name);
	}

	@Override
	public List<String> selectID() {
		return dao.selectID();
	}

}
