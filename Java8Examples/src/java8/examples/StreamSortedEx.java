package java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamSortedEx {

	public static void main(String[] args) {
		List<String> vehicle=Arrays.asList("bus", "car", "bycle", "bus", "car", "car", "bike");
          vehicle.stream().distinct().sorted().forEach(s ->System.out.println(s));
          
          System.out.println("-------------------------");
         
          List<Employee> emp= new ArrayList<>();
          emp.add(new Employee("Nataraja G", "Accounts", 8000));
          emp.add(new Employee("Nagesh Y", "Admin", 15000));
          emp.add(new Employee("Vasu V", "Security", 2500));
          emp.add(new Employee("Amar", "Entertainment", 12500));
          
         emp.stream().sorted((emp1,emp2)->emp1.getSalary().compareTo(emp2.getSalary())).filter(e->e.getSalary()>10000)
          .forEach(e ->System.out.println(e));
          
          //Optional<String> result = emp.stream()
        	//	  .collect(maxBy(Comparator.naturalOrder()));
        System.out.println("-------------------------------------------------");  
       emp.stream().sorted((emp1,emp2)->emp1.getSalary().compareTo(emp2.getSalary())).filter(e1 ->e1.getSalary()<10000)
       .forEach(e->System.out.println(e));
          
         
       
	}

}
