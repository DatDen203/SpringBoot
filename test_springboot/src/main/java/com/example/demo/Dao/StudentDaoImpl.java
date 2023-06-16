package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Mapper.StudentDaoMapper;
import com.example.demo.Model.StudentDto;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private StudentDaoMapper studentDaoMapper;

	@Override
	public List<StudentDto> GetListStudent() {
		// TODO Auto-generated method stub
		return studentDaoMapper.GetListStudent();
	}

	@Override
	public int insert(StudentDto obj) {
		// TODO Auto-generated method stub
		return studentDaoMapper.insert(obj);
	}

	@Override
	public StudentDto findById(String ID) {
		// TODO Auto-generated method stub
		return studentDaoMapper.findById(ID);
	}

	@Override
	public StudentDto findByIdUser(String ID) {
		// TODO Auto-generated method stub
		return studentDaoMapper.findByIdUser(ID);
	}

	@Override
	public List<StudentDto> findByName(String name) {
		// TODO Auto-generated method stub
		return studentDaoMapper.findByName(name);
	}

	@Override
	public void update(StudentDto obj) {
		// TODO Auto-generated method stub
		studentDaoMapper.update(obj);
	}

	@Override
	public void delete(String ID) {
		// TODO Auto-generated method stub
		studentDaoMapper.delete(ID);
	}

}
