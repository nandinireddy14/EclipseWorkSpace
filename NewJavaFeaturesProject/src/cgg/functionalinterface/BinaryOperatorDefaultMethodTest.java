package cgg.functionalinterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class BinaryOperatorDefaultMethodTest {
public static void main(String[] args) {
List<Employee> empList = new ArrayList<>();
	
	empList.add(new Employee("A", 30000.00, "HR"));
	empList.add(new Employee("B", 20000.00, "HR"));
	empList.add(new Employee("C", 100000.00, "HR"));
	empList.add(new Employee("D", 30000.00, "HR"));
	
	empList.add(new Employee("X", 30000.00, "Finance"));
	empList.add(new Employee("Y", 20000.00, "Finance"));
	empList.add(new Employee("X", 1000.00, "Finance"));
	empList.add(new Employee("P", 90000.00, "Finance"));
	
	Comparator<Employee> salaryComparator = Comparator.comparing(Employee::getSalary);
	
	Map<String, Optional<Employee>> maxSalByDeptMap = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
			Collectors.reducing(BinaryOperator.maxBy(salaryComparator))));
	System.out.println("Employee Max salary by department wise:::::");
	maxSalByDeptMap.forEach((dentName,emp)->{
		System.out.println(dentName);
		Employee employee = emp.get();
		System.out.println(employee);
	});
	System.out.println();
	System.out.println("Employee Min salary by department wise:::::");
	Map<String, Optional<Employee>> minSalByDeptMap = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
			Collectors.reducing(BinaryOperator.minBy(salaryComparator))));
	
	minSalByDeptMap.forEach((dentName,emp)->{
		System.out.println(dentName);
		Employee employee = emp.get();
		System.out.println(employee);
	});
}
}
