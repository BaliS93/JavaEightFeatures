package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


//Internal loop mainly deals with foreach and collections API will have this for each method.
public class InternalLoop {

	public static void main(String[] args) {
//		List<>
		
		List<String> list = new ArrayList<>();
		list.add("pk");
		list.add("ok");
		list.add("hurrah!");
		list.add("nice");
//		Consumer<Integer> cons = (t) -> System.out.println(t);
//		list.forEach(cons);
//		-> Below is internal loop
		list.forEach(t -> System.out.println(t));  
		

	}

}
