package com.cts.programs;

public class MergeSort {
	
		public int[] mergeSort(int a[],int b[]) {
			int len1=a.length;
			int len2=b.length;
			int i=0,j=0,k=0,c[]=new int[len1+len2];
			while(i<len1 && j<len2) {
				if(a[i]<b[j]) {
					c[k]=a[i];
					i++;
				}
				else {
					c[k]=b[j];
					j++;
				}k++;
			}
			if(i<len1) {
				for(;i<len1;k++) {
					c[k]=a[i];
					i++;
				}
			}
			if(j<len2) {
				for(;j<len2;j++) {
					c[k]=b[j];
					j++;
				}
			}
			return c;
		}
		}


