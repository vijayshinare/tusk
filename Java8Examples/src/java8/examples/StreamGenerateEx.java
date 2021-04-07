package java8.examples;

import java.util.UUID;
import java.util.stream.Stream;

public class StreamGenerateEx {

	public static void main(String[] args) {
		Stream<UUID> uuidstream=Stream.generate(UUID::randomUUID);
		uuidstream.limit(10).forEach(System.out::println);
	}

}
