package com.example.Api;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dto.StudentDto;
import com.example.Service.StudentServiceImpl;

@RestController
@RequestMapping(value = "api/")
public class StudentApi {

	/* @ResponseBody */
	/* @RequestMapping (value="/student", method = RequestMethod.POST) */

	@Autowired
	StudentServiceImpl service;

	@GetMapping("/student")
	public List<StudentDto> selectAllStudent() {
		List<StudentDto> listStudent = service.selectAll();
		return listStudent;
	}

	@PostMapping("/student")
	public void insertStudent(@RequestBody StudentDto obj) {
		service.insert(obj);
	}

	@PutMapping("/student/{id}")
	public ResponseEntity<StudentDto> updateStudent(@RequestBody StudentDto obj, @PathVariable int id) {
		StudentDto newStudent = service.findbyId(id);
		if ( newStudent == null) {
			System.out.println("Student with id = " + id + " not found !");
			return ResponseEntity.notFound().build();
		} else {
			newStudent.setAge(obj.getAge());	
			newStudent.setName(obj.getName());
			service.update(newStudent);
			return ResponseEntity.ok(newStudent);
		}
	}

	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		service.delete(id);
	}

	@GetMapping("/find-student/{id}")
	public StudentDto findById(@PathVariable("id") int id) {
		return service.findbyId(id);
	}

}
