package com.cgg.eis.service;

import java.io.IOException;

import com.cgg.eis.beans.Employee;

public interface EmployeeService {
	void delete(int id);
	void displayAll();
	String findInsurance(double salary,String desg);
	void save();
	Employee add(int id, String name, double salary, String desg) throws IOException;
	void getDetails(String inshc);
	
}
