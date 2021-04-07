package java8.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFindEx {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Nataraja G", "Accounts", 8000));
        empList.add(new Employee("Nagesh Y", "Admin", 15000));
        empList.add(new Employee("Vasu V", "Security", 2500));
        empList.add(new Employee("Amar", "Admin", 12500));
        
        empList.stream().filter(emp ->emp.getAccount().matches("Admin")).findFirst().ifPresent(System.out::println);
        empList.stream().filter(emp ->emp.getAccount().matches("Admin")).findAny().ifPresent(System.out::println);
        
        
        Optional<Employee> maxSalaryEmp =empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Employee with max salary:"
                + (maxSalaryEmp));
	}

}
