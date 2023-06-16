package com.example.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Dto.StudentDto;
import com.example.Mapper.StudentMapper;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<StudentDto> selectAll() {
		// TODO Auto-generated method stub
		return studentMapper.selectAll();
	}

	@Override
	public void insert(StudentDto obj) {
		// TODO Auto-generated method stub
		studentMapper.insert(obj);
	}

	@Override
	public void update(StudentDto obj) {
		// TODO Auto-generated method stub
		studentMapper.update(obj);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentMapper.delete(id);
	}

	@Override
	public StudentDto findById(int id) {
		// TODO Auto-generated method stub
		return studentMapper.findById(id);
	}

}
