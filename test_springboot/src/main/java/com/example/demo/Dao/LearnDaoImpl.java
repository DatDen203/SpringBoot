package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Mapper.LearnDaoMapper;
import com.example.demo.Model.LearnDto;

@Repository
public class LearnDaoImpl implements ILearnDao{

	@Autowired
	private LearnDaoMapper learnDaoMapper;

	@Override
	public List<LearnDto> getClassOfOneStudent(String id) {
		// TODO Auto-generated method stub
		return learnDaoMapper.getClassOfOneStudent(id);
	}

	@Override
	public List<LearnDto> getAllStudentOneClass(String id) {
		// TODO Auto-generated method stub
		return learnDaoMapper.gelAllStudentOneClass(id);
	}
	


	

}
