package com.example.demo.Service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.UserDaoImpl;
import com.example.demo.Model.UserDto;
import com.example.demo.Model.UserLogin;

@Service
public class UserService implements IUserService{
	@Autowired 
	private UserDaoImpl dao;

	public void register(UserDto obj) {
		dao.register(obj);
	}

	public UserDto validateLogin(UserLogin obj) throws IOException {
		return dao.validateLogin(obj);
	}

	public void update(UserDto obj) {
		dao.update(obj);
	}

	public String validateReigister(UserDto obj) {
		return dao.validateReigister(obj);
	}

	public UserDto findUserByEmail(String email) {
		return dao.findUserByEmail(email);
	}

	public void delete(String id) {
		dao.delete(id);
	}
	
	public UserDto findUserById(String id) {
		return dao.findUserById(id);
	}

}
