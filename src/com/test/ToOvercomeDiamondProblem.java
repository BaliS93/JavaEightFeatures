package com.test;

public class ToOvercomeDiamondProblem implements Maple,Test{

	public static void main(String[] args) {
		ToOvercomeDiamondProblem T1 =  new ToOvercomeDiamondProblem();
		T1.add();
		T1.add1();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
	System.out.println("print");
	}


	@Override
	public void add1() {
		// TODO Auto-generated method stub
	System.out.println("abstarctmethodoverrideninchildclass");
	}

	
}
