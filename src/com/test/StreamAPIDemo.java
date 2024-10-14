package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> L1 = Arrays.asList(2,4,6,7,8);
//		L1.stream().forEach(t->System.out.println(t));
		
		L1.stream().filter(t-> { System.out.println("hi"+t);
		return true;
		
		}).findFirst();
		
		
		
		List<Integer> L2 = Arrays.asList(2,4,6,7,8,8);
		
		Stream<Integer> A = L2.stream();
		A.forEach(i->System.out.println("list="+i));
//		A.forEach(i->System.out.println("hello"+i));
//		A.forEach(i->System.out.println("hello"+i));
		
		
		Set<Integer> L4 = new HashSet<>();
		L4.add(2);
		L4.add(8);
		L4.add(10);
		L4.add(89);
		
		
		Stream<Integer> J1= L4.stream();
		J1.forEach(i->System.out.println("set="+i));
//		J1.forEach(i->System.out.println("set"+i));
		

	}

}
