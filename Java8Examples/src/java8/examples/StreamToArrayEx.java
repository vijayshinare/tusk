package java8.examples;

import java.util.stream.Stream;

public class StreamToArrayEx {

	public static void main(String[] args) {
		String[] strArr = (String[]) Stream.of("bus", "car", "bicycle", "flight", "train").toArray();
        String[] strArr1 = Stream.of("bus", "car", "bicycle", "flight", "train").toArray(String[]::new);
    

	}

}
