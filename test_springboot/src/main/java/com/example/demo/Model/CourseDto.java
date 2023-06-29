package com.example.demo.Model;

public class CourseDto {
	private int id;
	private String name;
	
	public CourseDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public CourseDto() {

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
