package com.cts.programs.test;

import java.util.Arrays;

import com.cts.programs.MergeSort;

public class MergeSortTest {

		public static void main(String[] args) {
			MergeSort obj=new MergeSort();
			int[] a= {10,20,30};
			int[] b= {5,12,43};
			int[] c=obj.mergeSort(a, b);
			System.out.println(Arrays.toString(c));
		}
		}

