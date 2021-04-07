package com.java2novice.algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapToList {

	public static void main(String[] args) {
		Map<String,String> wordmap=new HashMap<String,String>();
		Set<Entry<String,String>> set=wordmap.entrySet();
		List<Entry<String,String>> list=new ArrayList<Entry<String,String>>(set);
		System.out.println(list);
		

	}

}
