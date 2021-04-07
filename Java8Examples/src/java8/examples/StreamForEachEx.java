package java8.examples;

import java.util.Arrays;
import java.util.List;

public class StreamForEachEx {

	public static void main(String[] args) {
		List<String> vehicle=Arrays.asList("bus", "car", "bicycle", "flight", "train");
		//vehicle.stream().forEach(s->System.out.println(s));
		vehicle.stream().forEach(System.out::println);
		vehicle.forEach(System.out::println);
		
	}

}
