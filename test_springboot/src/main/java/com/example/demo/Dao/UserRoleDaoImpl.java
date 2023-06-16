package com.example.demo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Mapper.UserRoleDaoMapper;
import com.example.demo.Model.UserRoleDto;

@Repository
public class UserRoleDaoImpl implements IUserRoleDao {

	@Autowired
	private UserRoleDaoMapper userRoleDaoMapper;
	
	@Override
	public void insert(UserRoleDto obj) {
		// TODO Auto-generated method stub
		userRoleDaoMapper.insert(obj);
	}

	@Override
	public UserRoleDto findByIdUser(String id) {
		// TODO Auto-generated method stub
		return userRoleDaoMapper.findByIdUser(id);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		userRoleDaoMapper.delete(id);
	}


}
