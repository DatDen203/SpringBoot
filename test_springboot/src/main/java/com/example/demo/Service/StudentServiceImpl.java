package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.StudentDaoImpl;
import com.example.demo.Model.StudentDto;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentDaoImpl dao;

	public List<StudentDto> GetListStudent() {
		return dao.GetListStudent();
	}

	public void insert(StudentDto obj) {
		dao.insert(obj);
	}

	public StudentDto findById(String ID) {
		return dao.findById(ID);
	}

	public void update(StudentDto obj) {
		dao.update(obj);
	}

	public void delete(String ID) {
		dao.delete(ID);
	}

	public List<StudentDto> findByName(String name) {
		return dao.findByName(name);
	}

	public StudentDto findByIdUser(String id) {
		return dao.findByIdUser(id);
	}

}
