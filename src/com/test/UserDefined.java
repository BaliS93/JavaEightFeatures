
//EXAMPLE FOR METHOD REFERENCE IN JAVA


package com.test;

interface Parser{
	String stringparser(String str);
	
}

class ABC{

	
	public static String convert(String str) {
		// TODO Auto-generated method stub
		if(str.length()<=3) {
			return str = str.toUpperCase();
		}
		else {
			return str = str.toLowerCase();
		}
		
	}
	
}

class Printer{
	
	public void printthestring(String str, Parser P) {
		str = P.stringparser(str);
		System.out.println(str);
	}
}





public class UserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Printer ptr =new Printer();
		ptr.printthestring("pkk",(ABC::convert));

	}

}
