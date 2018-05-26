package com.cts.programs.test;

import java.util.Arrays;

import com.cts.programs.SelectionSort;

public class SelectionSortTest {
		public static void main(String[] args) {
			SelectionSort obj = new SelectionSort();
			int arr[]= {9,14,3,2,43,11,58,22};
			obj.selectionSort(arr);
			System.out.println(Arrays.toString(arr));
		}
		
}
