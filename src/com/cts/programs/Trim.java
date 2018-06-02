package com.cts.programs;

public class Trim {
/*public String withoutTrim(String s)
{
	{
	    int j = 0;
	    int count = 0;                                                                                                                   // Number of extra spaces
	    int spaces = 0;                                                                                                                   // Number of left spaces
	    char ch[] = s.toCharArray();
	    int len = s.length();
	    StringBuffer bchar = new StringBuffer();
	    if(ch[0] == ' ')
	    {
	        while(ch[j] == ' ')
	        {
	            spaces++;
	            j++;
	        }   
	    }   
	    for(int i = spaces; i < len; i++) 
	    {   
	        if(ch[i] != ' ')
	        {
	            if(count > 1 || count == 1)     
	            {
	                bchar.append(' ');
	                coun*/
	        
	                public int[] deleteposition(int num[],int position){
	                	int size=num.length;
	                	for(int i=position;i<size-1;i++){
	                	num[i]=num[i+1];
	                			}
	                	num[size-1]=0;
	                		return num;
	                }

