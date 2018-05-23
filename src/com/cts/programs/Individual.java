package com.cts.programs;

public class Individual {
	int sum=0;
public int digit(int a)
{

if(a==0)
{
	return sum;
}
else
{
	
	sum+=(a%10);
	digit(a/10);

}
return sum;
	
}
}
