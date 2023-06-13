package com.cgg.eis.pl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.cgg.eis.beans.Employee;
import com.cgg.eis.exception.EmployeeException;
import com.cgg.eis.service.EmployeeService;
import com.cgg.eis.service.EmployeeServiceImplem;

public class Main {

	public static void main(String[] args) throws Exception {
		EmployeeService employeeService = new EmployeeServiceImplem();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
	    while(true) {
	    	System.out.println("Press 1 to add employee");
	    	System.out.println("Press 2 to delete employee");
	    	System.out.println("Press 3 to display all employees");
	    	System.out.println("Press 4 to exit");
	    	System.out.println("Press 5 to Display Employee on scheme");
	    	
	    	System.out.println("enter your choice:");
	    	int ch = Integer.parseInt(br.readLine());
	    	
	    	if(ch==1) {
	    		//add employee...
	    		System.out.println("id name salary Designation ");
	    		int id = Integer.parseInt(br.readLine());
	    		String name=br.readLine();
	    			    		
	    		double salary=0.0;
	    		try {
	    		salary=Double.parseDouble(br.readLine());
	    		if(salary<3000)
	    		throw new EmployeeException(salary);
	    		}
	    		catch(EmployeeException e) {
	    			System.out.println(e);
	    			return;
	    		}
	    		String designation=br.readLine();
	    		Employee e = employeeService.add(id, name, salary, designation);
	    	}
	    	else if(ch==2) {
	    		//delete employee
	    		System.out.println("Enter employee id to be deleted");
	    		int id=Integer.parseInt(br.readLine());
	    		employeeService.delete(id);
	    	}
	    	else if(ch==3) {
	    		//display all employees...
	    		employeeService.displayAll();
	    	}
	    	else if(ch==4) {
	    		//exit
	    		employeeService.save();
	    		break;
	    	}
	    	else if(ch==5) {
	    		//getEmpDetails of insurance scheme
    		String idesg=br.readLine();
	    		employeeService.getDetails(idesg);
	    	}
	    }
	
		System.out.println("Thank You");

	}

}
