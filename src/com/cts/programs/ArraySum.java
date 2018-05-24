package com.cts.programs;

public class ArraySum {
	
		public int sumArray(int[] num) {
			int len=num.length;
			int sum=0;
			for (int i=0;i<len;i++) {
				sum+=num[i];
			}
			return sum;
		}
		}


