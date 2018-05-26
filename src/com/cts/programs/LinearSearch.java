package com.cts.programs;

public class LinearSearch {
	
		public boolean search(int a[], int x) {     // replace boolean  into integer 
			int size=a.length;
			for(int i=0;i<size;i++) {
				if(a[i]==x)
				{
					return true;                   // return i+1
				}
			}
			return false;                         //return -1
		}

	}


