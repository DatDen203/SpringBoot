package com.example.demo.Dao;

import java.io.IOException;

import com.example.demo.Model.UserDto;
import com.example.demo.Model.UserLogin;

public interface IUserDao {
	public int register(UserDto obj);
	public UserDto validateLogin(UserLogin obj) throws IOException;	
	public void update(UserDto obj);
	public String validateReigister(UserDto obj);
	public UserDto findUserByEmail(String email);
	public void delete(String id);
	public UserDto findUserById(String id);
}
