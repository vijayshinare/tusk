package java8.examples;

import java.util.stream.Stream;

public class StreamSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Stream.of(0,2,3,4,5,6,7,8,9).skip(6).forEach(num->System.out.print(num +" "));
	}

}
