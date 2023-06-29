package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Mapper.ClassRoomDaoMapper;
import com.example.demo.Model.ClassRoomDto;

@Repository
public class ClassRoomDaoImpl implements IClassRoomDao {
	
	@Autowired
	private ClassRoomDaoMapper classroomMapper;

	@Override
	public int insertClassRoom(ClassRoomDto obj) {
		return classroomMapper.insertClassRoom(obj);
	}

	@Override
	public void updateClassRoom(ClassRoomDto obj) {
		classroomMapper.updateClassRoom(obj);
	}

	@Override
	public List<ClassRoomDto> selectAll() {
		return classroomMapper.selectAll();
	}

	@Override
	public void deleteClassRoom(String id) {
		classroomMapper.deleteClassRoom(id);
	}

	@Override
	public ClassRoomDto findById(String id) {
		return classroomMapper.findById(id);
	}

	@Override
	public ClassRoomDto findByName(String name) {
		return classroomMapper.findByName(name);
	}

	@Override
	public List<ClassRoomDto> getAllClass(String id) {
		return classroomMapper.getAllClass(id);
	}

}
