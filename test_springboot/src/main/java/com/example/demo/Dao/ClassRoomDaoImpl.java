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
	public int insert(ClassRoomDto obj) {
		return classroomMapper.insert(obj);
	}

	@Override
	public void update(ClassRoomDto obj) {
		classroomMapper.update(obj);
	}

	@Override
	public List<ClassRoomDto> GetListClass() {
		return classroomMapper.GetListClass();
	}

	@Override
	public void delete(String id) {
		classroomMapper.delete(id);
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
