package com.example.demo.Mapper;
	
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.Model.TeacherDto;

@Mapper
public interface TeacherDaoMapper {
	/*@Select("Select * from teacher")*/
	public List<TeacherDto> selectAll();

	public int insertTeacher(TeacherDto obj);

	public TeacherDto findById(String ID);

	public List<TeacherDto> findByName(String name);

	public void updateTeacher(TeacherDto obj);

	public void deleteTeacher(String ID);

	public List<String> selectID();

//	public List<ClassRoomDto> getAllClass(String idTeacher);
}
