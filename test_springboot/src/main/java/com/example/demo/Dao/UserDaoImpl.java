package com.example.demo.Dao;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Mapper.UserDaoMapper;
import com.example.demo.Model.UserDto;
import com.example.demo.Model.UserLogin;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private UserDaoMapper userDaoMapper;
	
	@Override
	public int register(UserDto obj) {
		// TODO Auto-generated method stub
		return userDaoMapper.register(obj);
	}

	@Override
	public UserDto validateLogin(UserLogin obj) throws IOException {
		// TODO Auto-generated method stub
		return userDaoMapper.validateLogin(obj);
	}

	@Override
	public void update(UserDto obj) {
		// TODO Auto-generated method stub
		userDaoMapper.update(obj);
	}

	@Override
	public String validateReigister(UserDto obj) {
		// TODO Auto-generated method stub
		return userDaoMapper.validateReigister(obj);
	}

	@Override
	public UserDto findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userDaoMapper.findUserByEmail(email);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		userDaoMapper.delete(id);
	}

	@Override
	public UserDto findUserById(String id) {
		// TODO Auto-generated method stub
		return userDaoMapper.findUserById(id);
	}

	
	
}
