package com.test;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> L1 = Arrays.asList("Ji","Hi","Li","ki");
		L1.forEach(i -> System.out.println(i));
		
		L1.forEach(System.out::println);
		
		
		

	}

}
