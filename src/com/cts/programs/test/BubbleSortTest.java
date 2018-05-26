package com.cts.programs.test;

import java.util.Arrays;

import com.cts.programs.BubbleSort;

public class BubbleSortTest {
	
		public static void main(String[] args) {
			BubbleSort obj = new BubbleSort();
			int[] arr= {2,53,10,58,34};
			obj.bubbleSort(arr);
			System.out.println(Arrays.toString(arr));
		
		}
}
