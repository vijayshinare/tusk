package java8.examples;

import java.util.ArrayList;
import java.util.List;

public class SortDescOrder {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(11);
		list.add(13);
		
		list.stream().sorted((i,j)->j.compareTo(i)).forEach(x ->System.out.println(x));
		Integer minval=list.stream().min((i,j)->j.compareTo(i)).get();
		Integer maxval=list.stream().max((i,j)->j.compareTo(i)).get();
		//Integer minval=list.stream().min((i,j)->i.compareTo(j)).get();
		System.out.println("MinValue= "+minval);
		System.out.println("maxval= "+maxval);
		//list.stream().sorted().forEach(e->System.out.println(e));

	}

}
