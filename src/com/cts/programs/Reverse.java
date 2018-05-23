package com.cts.programs;



public class Reverse 
{
public int rev(int x)

{
int y=0;
	while(x!=0)	
	{	
		int z=x%10;
		y=y*10+z;
		x=x/10;
	}
	return y;
}


}
