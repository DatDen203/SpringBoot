package com.example.demo.Service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.UserDto;
import com.example.demo.Model.UserLogin;

@Service
public interface IUserService {
	@Autowired
	public void register(UserDto obj);
	
	@Autowired
	public String validateReigister(UserDto obj);

	@Autowired
	public UserDto validateLogin(UserLogin obj) throws IOException;

	@Autowired
	public void update(UserDto obj);


	@Autowired
	public UserDto findUserByEmail(String email);
	
	@Autowired
	public void delete(String id);
	
	@Autowired
	public UserDto findUserById(String id);
}
