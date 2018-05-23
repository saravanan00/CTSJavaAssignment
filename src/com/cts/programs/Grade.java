package com.cts.programs;

public class Grade {
public String average(int mat,int sci,int tam)
{
	int total,avg;
	total=mat+sci+tam;
	avg=total/3;
	if(avg>90)
		return "A+";
	else if(avg>80)
		return "A";
	else if(avg>70)
		return "A-";
	else if(avg>60)
		return "B+";
	else if(avg>50)
		return "B";
	else
		return "fail";
}
}
