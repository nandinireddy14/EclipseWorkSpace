package com.cgg.eis.exception;

public class EmployeeException extends Exception{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double salary;
	
	public EmployeeException(double salary) {
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "EmployeeException [salary=" + salary + " less than 3000]";
	}

}
