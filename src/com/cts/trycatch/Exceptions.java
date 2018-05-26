package com.cts.trycatch;

public class Exceptions {
public static void main (String[]args) {
	int x;
	int y;
	try {
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		System.out.println(x/y);
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		System.out.println("please provide integer");
		e.printStackTrace();
	}
	catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		System.out.println("provide correct values");
		e.printStackTrace();}
	catch (ArrayIndexOutOfBoundsException e) {
		// TODO Auto-generated catch block
		System.out.println("give two values");
		e.printStackTrace();}
	
}
}
//unchecked exceptions  userdefined
//checked predefined

	
