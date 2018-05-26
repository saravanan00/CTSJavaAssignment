package com.cts.programs;

public class InsertArray {

		public void insertElement(int[] array,int pos,int value) {
			
			int length=array.length;
			for (int c = length - 2; c >= pos - 1; c--)
			      array[c+1] = array[c];
			 	
			      array[pos-1] = value;
				
		  }
		}


