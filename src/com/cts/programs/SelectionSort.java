package com.cts.programs;

public class SelectionSort {
	
		public  void selectionSort(int[] arr){ 
			int  len=arr.length;
	        for (int i = 0; i < len - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < len; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;                  //searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	}
	}


