package com.cts.programs;

public class BinarySearch {

		public boolean search(int arr[], int key) {
			int size=arr.length;
			int first=0;
			int last=size;
			int mid=(first+last)/2;
			 while( first <= last ){  
			      if ( arr[mid] < key ){  
			        first = mid + 1;     
			      }else if ( arr[mid] == key ){  
			        return true;  
			        
			      }else{  
			         last = mid - 1;  
			      }  
			      mid = (first + last)/2;  
			   }  
			   return false;
		}
		}

