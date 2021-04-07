package java8.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxSalary 
{
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Nataraja G", "Accounts", 8000));
        empList.add(new Employee("Nagesh Y", "Admin", 15000));
        empList.add(new Employee("Vasu V", "Security", 2500));
        empList.add(new Employee("Amar", "Admin", 12500)); 
        
        Optional<Employee> maxSalaryEmp =empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Employee with max salary:"
                + (maxSalaryEmp));
        
        Optional<Employee> minSalaryEmp =empList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Employee with min salary:"
                + (minSalaryEmp));
	}

}
