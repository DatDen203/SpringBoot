package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.StudentDaoImpl;
import com.example.Dto.StudentDto;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired 
	private StudentDaoImpl daoImpl;
	
	@Override
	public List<StudentDto> selectAll() {
		return daoImpl.selectAll();
	}

	@Override
	public void insert(StudentDto obj) {
		// TODO Auto-generated method stub
		daoImpl.insert(obj);
	}

	@Override
	public void update(StudentDto obj) {
		// TODO Auto-generated method stub
		daoImpl.update(obj);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		daoImpl.delete(id);
	}

	@Override
	public StudentDto findbyId(int id) {
		// TODO Auto-generated method stub
		return daoImpl.findById(id);
	}

}
