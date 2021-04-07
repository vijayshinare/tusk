package java8.examples;

import java.util.Arrays;
import java.util.List;

public class CreateStreamWithListEx {

	public static void main(String[] args) {
		 List<String> vehicles=Arrays.asList("bus", "car", "bicycle", "flight", "train");
          //vehicles.stream().forEach(System.out::println);
		 vehicles.stream().forEach(k ->System.out.println(k));
	}

}
