package com.test;

interface Garage{
	
	String repair(String model);
}

class Expenses{
	
	static String repair(String model) {
		if(model.equals("Mercedes")) {
			return "its very costly";
		}
		else {
			return "its not that costly";
		}
	}
}

class TypeofCar{
	
	
	void checkRateOfTheCar(String str, Garage G ) {
		str = G.repair(str);
		System.out.println(str);
	}
	
	
}


public class CarModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Mercedes";
		TypeofCar T1 = new TypeofCar();
		T1.checkRateOfTheCar(str,(model-> Expenses.repair(model)));//by lambda exprerssion
		T1.checkRateOfTheCar(str,(Expenses::repair)); //by using method reference


	}

}
