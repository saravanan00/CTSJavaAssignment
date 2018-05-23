package com.cts.programs;

public class ArrayLargestNumber {
	public int large(int a[])
	{
		int max=a[0],i;
		int size=a.length;
		for(i=0;i<size;i++)
		{
			if(max<a[i]) {
				max=a[i];				
			}
		}
		return max;
		
		
	}

}
