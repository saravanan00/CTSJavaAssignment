package com.cts.programs;

public class CountLowerCase {
	
		public int lowercaseCount(String str) {
			int lower=0 ,len=str.length();
			 for(int i = 0; i < len; i++)
		     {
		         char ch = str.charAt(i);
		         if (ch >= 'a' && ch <= 'z')
		             lower++; 
		     }
			   return lower;
		}
		}

