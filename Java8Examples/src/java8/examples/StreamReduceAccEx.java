package java8.examples;

import java.util.stream.Stream;

public class StreamReduceAccEx {

	public static void main(String[] args) {
		Stream.of(10,20,22,12,14).reduce((x,y)->x+y).ifPresent(System.out::println);
		 
        Stream.of(10,20,22,12,14).reduce(Integer::sum).ifPresent(System.out::println);
 
        Stream.of("java", "c", "c#", "python").reduce((x,y)->x+" | "+y).ifPresent(System.out::println);
        
        Integer arrSum = Stream.of(10,20,22,12,14).reduce(1000, Integer::sum);
        System.out.println(arrSum);
 
        arrSum = Stream.of(10,20,22,12,14).reduce(1000, (x,y)->x+y);
        System.out.println(arrSum);
 
        String result = Stream.of("java", "c", "c#", "python").reduce("Languages:", (x,y)->x+" | "+y);
        System.out.println(result);
        
      //  Stream.of(20,30,50).reduce((a,b->a+b).ifPresent(System.out::println);
        Stream.of(10,20,22).reduce((x,y)->x+y).ifPresent(System.out::println);
    
	}

}
