import java.util.Arrays;


public class JavaObjectSorting {

	public static void main(String[] args) 
	{
		Employee emp[]=new Employee[4];
		emp[0]=new Employee(10,"mikey",25,10000);
		emp[1]=new Employee(13,"vijay",21,40000);
		emp[2]=new Employee(7,"pankaj",12,90000);
		emp[3]=new Employee(14,"rahul",45,50000);
		
		Arrays.sort(emp);
		System.out.println("Default sorting of employee list:\n"+Arrays.toString(emp));
		
		Arrays.sort(emp,Employee.SalaryComparator);
		System.out.println("Employee list sorted by salary:\n" +Arrays.toString(emp));
		
		Arrays.sort(emp,Employee.AgeComparator);
		System.out.println("Employee list sorted by Age:\n"+Arrays.toString(emp));
		
		Arrays.sort(emp,Employee.NameComparator);
		System.out.println("Employee list sorted by Name:\n"+Arrays.toString(emp));
		
	//	Arrays.sort(emp,new EmployeeComparatorByIdAndName());
		//System.out.println("Employee list sorted by ID and Name:\n"+Arrays.toString(emp));
		
		
		

	}

}
