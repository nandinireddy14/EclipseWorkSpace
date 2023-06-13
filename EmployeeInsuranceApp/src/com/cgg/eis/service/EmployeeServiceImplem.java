package com.cgg.eis.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.cgg.eis.beans.Employee;

public class EmployeeServiceImplem implements EmployeeService{
	HashMap<Integer,Employee> employees=new HashMap<>();
	
	public EmployeeServiceImplem() throws Exception {
		super();
		File file=new File("emp.ser");
		FileInputStream fis;
		try {
		if(file.exists()) {
			fis=new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			employees = (HashMap<Integer,Employee>)ois.readObject();
		}
		}
		catch(IOException|ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		}
	
	
	@Override
	public Employee add(int id, String name, double salary, String desg) throws IOException{
		String ins=findInsurance(salary,desg);
		Employee e=new Employee(id,name,salary,desg,ins);
		employees.put(e.getId(),e);
		return e;
	}

	@Override
	public void delete(int id) {
		employees.remove(id);
		
	}

	@Override
	public void displayAll() {
		employees.forEach((k,v)->{
			System.out.println("Id : "+v.getId());
			System.out.println("Name : "+v.getName());
			System.out.println("Designation : "+v.getDesg());
			System.out.println("Salary : "+v.getSalary());
			System.out.println("Insurance Scheme : "+v.getInsch());
			System.out.println("-------------------------------");
		});
		
	}

	@Override
	public String findInsurance(double salary, String desg) {
		String s="";
		if(desg.equals("System Associate") && (salary>5000 && salary<20000)) {
			s="Scheme C";
		}
		else if(desg.equals("Programmer") && (salary>=20000 && salary<40000)) {
			s="Scheme B";
		}
		else if(desg.equals("Manager") && (salary>=40000)) {
			s="Scheme A";
		}
		else if(desg.equals("Clerk") && (salary<5000)) {
			s="No Scheme";
		}
       return s;
	}

	@Override
	public void save() {
		try {
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employees);
		oos.flush();
		oos.close();
		fos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void getDetails(String idesg) {
		employees.forEach((k,v)->{
			if(v.getInsch().equals(idesg)) {
				System.out.println("Id : "+v.getId());
				System.out.println("Name : "+v.getName());
				System.out.println("Salary : "+v.getSalary());
				System.out.println("Designation : "+v.getDesg());
				System.out.println("Insurance Scheme : "+v.getInsch());
			}
		});
		
	}

}


