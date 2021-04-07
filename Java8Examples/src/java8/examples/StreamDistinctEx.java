package java8.examples;

import java.util.Arrays;
import java.util.List;

public class StreamDistinctEx {

	public static void main(String[] args)
	{
		List<String> vehicle=Arrays.asList("bus", "car", "bycle", "bus", "car", "car", "bike");
		List<Integer> Number=Arrays.asList(2,3,5,4,3,2,5,6,9);
              //vehicle.stream().distinct().forEach(s -> System.out.println(s));
              Number.stream().distinct().forEach(s -> System.out.print(s+ " "));
	}

}
