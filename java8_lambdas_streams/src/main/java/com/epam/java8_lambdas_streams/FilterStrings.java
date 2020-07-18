package com.epam.java8_lambdas_streams;

import java.util.*;
import java.util.stream.*;

public class FilterStrings {
	public static List<String> search(List<String> list) {
	return list.stream().filter(s -> s.startsWith("a") && s.length()==3).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		List<String> arraylist = new ArrayList<String>();
		 arraylist.add("abc"); 
	     arraylist.add("aaa"); 
	     arraylist.add("bdca");
	     arraylist.add("bbb");
	     arraylist.add("abcd");
	     List<String> s = search(arraylist); 
	     System.out.println(s);

	}

}
