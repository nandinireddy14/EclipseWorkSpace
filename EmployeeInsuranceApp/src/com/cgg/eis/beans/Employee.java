package com.cgg.eis.beans;

import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	double salary;
	String desg;
	String insch;
	
	
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, double salary, String desg, String insch) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desg = desg;
		this.insch = insch;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getInsch() {
		return insch;
	}
	public void setInsch(String insch) {
		this.insch = insch;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", desg=" + desg + ", insch=" + insch
				+ "]";
	}
	
	
}
