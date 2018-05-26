package com.cts.programs;

public class ArrayMerge {
	
		public void mergeArrayWithoutUsing3rVariable(int[] a, int[] b) {
			
			int len = b.length;
			
			int i;
			for( i=0;a[i]!=-1;i++);
		
			for (int j=0; j <len ; i++,j++) {
				a[i] = b[j];
			}		
		}
		public int[] mergeArrayUsing3rdVariable(int[] a, int[] b) {
			int len1=a.length;
			int len2=b.length;
			int[] c = new int[len1 + len2];
			int i=0;
			for ( i = 0; i < len1; i++) {
				c[i] = a[i];
				
			}
			for (int j = 0; j < len2; j++) {
				c[i++] = b[j];
			}
			return c;
		}
	}


