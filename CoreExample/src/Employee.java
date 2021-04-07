import java.util.Comparator;


public class Employee implements Comparable<Employee>
{
private int id;
private int age;
private long salary;
private String name;
public int getId() {
	return id;
}
public int getAge() {
	return age;
}
public long getSalary() {
	return salary;
}
public String getName() {
	return name;
}

public Employee(int id,String name, int age, long salary ) {
	super();
	this.id = id;
	this.age = age;
	this.salary = salary;
	this.name = name;
}
@Override
public int compareTo(Employee emp) {
	
	return (this.id-emp.id);
}
@Override
public String toString() {
	return "Employee [id=" + id + ", age=" + age + ", salary=" + salary
			+ ", name=" + name + "]";
}


/**
     * Comparator to sort employees list or array in order of Salary
     */
    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

    /**
     * Comparator to sort employees list or array in order of Age
     */
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    };

    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

}
