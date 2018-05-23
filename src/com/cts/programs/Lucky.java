package com.cts.programs;

public class Lucky {
	public int sum(int a)
	{
		int x=0;
		while(a>0)
		{
			int b=a%10;
			x=x+b;
			a=a/10;
			if(x>9)
			{
				a=x;
				x=0;
			}
		}
		return x;
	
	}

}
