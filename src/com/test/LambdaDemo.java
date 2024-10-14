package com.test;


interface A {
	void c(int i);
}

interface D{
	void j(int z);
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj =i->
				// TODO Auto-generated method stub
				System.out.println("hello"+i);
				
		
		D D1 = z->System.out.println("secondinterface"+z);
		
		obj.c(5);
		D1.j(9);
		
		
		
		
		

	}

}
