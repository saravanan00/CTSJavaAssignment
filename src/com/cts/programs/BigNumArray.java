package com.cts.programs;


	public class BigNumArray {
		public int biggestArray(int a[]) {
			 
			int max = a[0]; 
		    int len=a.length;
			for (int i = 1; i < len; i++)  
			{
				if (a[i] > max) 
				{
					max = a[i];
				}
			}
			return max;
		}
		public int biggestArrayReturnIndex(int a[]) {
			 
			int max = a[0]; 
		    int len=a.length;
		    int index=0;
			for (int i = 1; i < len; i++)  
			{
				if (a[i] > max) 
				{
					max = a[i];
					index=i;
				}
			}
			return index+1;
		}
		}

