package cgg.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import cgg.comparator.Employee;

public class FunctionComposeExample {

	public static void main(String[] args) {
		Function<Employee,String>  empNameFun=e->e.getName();
		
		Function<Employee, Employee> funcEmpFirstName = e -> {
			int index = e.getName().indexOf(" ");
			String firstName = e.getName().substring(0, index);
			e.setName(firstName);
			return e;
		};
		List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45), new Employee("Harry Major", 25),
				new Employee("Ethan Hardy", 65), new Employee("Nancy Smith", 15),
				new Employee("Deborah Sprightly", 29));
		List<String> empFirstNameList = convertEmpListToNamesList(employeeList, empNameFun.compose(funcEmpFirstName));
		empFirstNameList.forEach(s -> {
			System.out.println(s);
		});


	}
	public static List<String> convertEmpListToNamesList(List<Employee> employeeList,
			Function<Employee, String> funcEmpToString) {
		List<String> empNameList = new ArrayList<String>();
		for (Employee emp : employeeList) {
			empNameList.add(funcEmpToString.apply(emp));
		}
		return empNameList;
		}

}
