package java8.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("Nataraja G", "Accounts", 80000));
        empList.add(new Employee("Nagesh Y", "Admin", 20000));
        empList.add(new Employee("Vasu V", "Security", 30000));
        empList.add(new Employee("Amar", "Entertainment", 12500));
        List<Employee> filteredList=empList.stream().filter(emp ->emp.getSalary() > 10000 && emp.getSalary()<30000).sorted()
        		.collect(Collectors.toList());
       // filteredList.forEach(System.out::println);
        
	}

}
