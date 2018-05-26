package com.cts.programs.test;

import java.util.Arrays;

import com.cts.programs.ArrayMerge;

public class ArrayMergeTest {

		public static void main(String[] args) {
			ArrayMerge obj=new ArrayMerge();
			int a[] = new int[10];
			a[0]=10;
			a[1]=20;
			a[2]=30;
			a[3]=40;
			a[4]=-1;
			int[] b= {50,60,80};
			int[] d= {10,20,30,40};
		    obj.mergeArrayWithoutUsing3rVariable(a, b);
		    System.out.println("Merge an array Without Using Third Variable");
			System.out.println(Arrays.toString(a));
			System.out.println("Merge an array Using Third Variable");
			System.out.println(Arrays.toString(obj.mergeArrayUsing3rdVariable(d, b)));
		
		}
}
