package cgg.spring.mvc.model;


import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
private String name;
private Long id;
/* @DateTimeFormat(pattern="yyyy-MM-dd") */
private String dob;
private List<String> course;
private String gender;
private String type;

private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public List<String> getCourse() {
	return course;
}
public void setCourse(List<String> course) {
	this.course = course;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Student(String name, Long id, String dob, List<String> course, String gender, String type, Address address) {
	super();
	this.name = name;
	this.id = id;
	this.dob = dob;
	this.course = course;
	this.gender = gender;
	this.type = type;
	this.address = address;
}





}
