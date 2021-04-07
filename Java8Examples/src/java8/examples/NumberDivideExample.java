package java8.examples;

import java.util.Arrays;
import java.util.List;

public class NumberDivideExample {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,3,5,3,2,6,7,9,10,30);
		list.stream().distinct().filter(l1 ->l1 % 3==0 && l1 %5==0).forEach(System.out::println);
		System.out.println("--------------");
		list.stream().distinct().filter(l1 ->l1 % 5==0).forEach(System.out::println);

	}

}
