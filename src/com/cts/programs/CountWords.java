package com.cts.programs;

public class CountWords {

		public int wordCount(String str1)
		{
			 int count=0;  
		     int len=str1.length();     
		     for(int i=0;i<len;i++)  
		     {  
		         if( ((i>0)&&(str1.charAt(i)!=' ')&&(str1.charAt(i-1)==' ')) || ((str1.charAt(i)!=' ')&&(i==0)) )  
		            count++;  
		     }  
		     return count;  
		}
		}

