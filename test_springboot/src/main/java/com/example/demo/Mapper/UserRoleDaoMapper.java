package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Model.UserRoleDto;

@Mapper
public interface UserRoleDaoMapper {

	public void insert(UserRoleDto obj);

	public UserRoleDto findByIdUser(String id);

	public void delete(String id);
}
