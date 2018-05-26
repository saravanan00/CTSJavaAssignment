package com.cts.programs.test;

import com.cts.programs.BigNumArray;

public class BigNumArrayTest {
	public static void main(String[] args) {
		BigNumArray obj=new BigNumArray();
		int num[]= {10,20,30};
		System.out.println("Biggest element in the array");
		System.out.println(obj.biggestArray(num));
		System.out.println("Biggest Element Length in the array");
		System.out.println(obj.biggestArrayReturnIndex(num));
	}
	}


