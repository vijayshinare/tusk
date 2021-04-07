package java8.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamFlatMapEx {

	public static void main(String[] args) {
		try {
			long noOfWords =Files.lines(Paths.get("C:\\Users\\vijay.shinare\\Desktop\\tech.txt")).flatMap(l ->Arrays.stream(l.split(" +"))).distinct().count();
			System.out.println("noOfWords: "+noOfWords);
			}catch(IOException e)
		{
				e.printStackTrace();
		}

	}

}
