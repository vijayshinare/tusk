package java8.examples;

import java.util.stream.Stream;

public class StreamLimitEx {

	public static void main(String[] args) {
		Stream.of("bus", "car", "bicycle", "flight", "train").limit(4).forEach(e ->System.out.println(e));

	}

}
