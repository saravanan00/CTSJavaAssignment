package com.cts.programs.test;

import java.util.Arrays;

import com.cts.programs.InsertArray;

public class InsertArrayTest {
	
		public static void main(String[] args) {
			InsertArray obj =new InsertArray();
			int[] array= {10,20,50,80,90};
			obj.insertElement(array,3,8);
			System.out.println(Arrays.toString(array));
		  }
		
}
