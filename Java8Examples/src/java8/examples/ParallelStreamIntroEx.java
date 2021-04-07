package java8.examples;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamIntroEx {

	public static void main(String[] args) {
		List<String> vehicles=Arrays.asList("bus", "car", "bicycle", "flight", "train");
	//	vehicles.parallelStream().filter(str->str.length() > 3).map(String::toUpperCase).sorted().forEach(System.out::println);
        vehicles.parallelStream().filter(str->str.length() >3).map(s->s.toUpperCase()).sorted().forEach(System.out::println);
        //vehicles.parallelStream().map(s->s.toUpperCase()).sorted().forEach(System.out::println);
	}

}