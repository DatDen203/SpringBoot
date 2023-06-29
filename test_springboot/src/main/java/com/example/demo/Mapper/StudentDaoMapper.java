package com.example.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Model.StudentDto;

@Mapper
public interface StudentDaoMapper {

	/* @Select("select * from student") */
	public List<StudentDto> GetListStudent();

	public int insertStudent(StudentDto obj);

//	@Select("select * from student where ID = #{ID}")
	public StudentDto findById(String ID);

	public StudentDto findByIdUser(String ID);

	public List<StudentDto> findByName(String name);

	public void updateStudent(StudentDto obj);

	public void deleteStudent(String ID);

}
