package java8.examples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFilterEx {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("Vijay","saving",10000));
		list.add(new Employee("Ajay","saving",70000));
		list.add(new Employee("Rahul","saving",90000));
		list.add(new Employee("Kiran","saving",40000));
		list.add(new Employee("Amol","saving",25000));
		list.add(new Employee("Ashok","saving",15000));
		
		list.stream().filter(k ->k.getSalary() >25000).forEach(k ->System.out.println(k));// salary >25000
		//list.stream().forEach(k ->System.out.println(k));//to show all employees
		//list.stream().filter(k->k.getSalary()> 40000).collect(Collectors.groupingBy(m->m.getAccount()));

	}

}

