package com.example.demo.Dao;

import com.example.demo.Model.UserRoleDto;


public interface IUserRoleDao {

	public void insert(UserRoleDto obj);

	public UserRoleDto findByIdUser(String id);

	public void delete(String id);
}
