package com.cts.programs;

public class SpacePattern {
	
		public void spaceNumPattern(int x) {
			for(int i=1;i<x;i++) {
				for(int j=1;j<x-i;j++) {
				System.out.print(" ");  
				// only in c printf("%nd",x-i," ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
		}
		public void spaceStarPattern(int x) {
			for(int i=1;i<x;i++) {
				for(int j=1;j<x-i;j++) {
				System.out.print(" ");  
				// only in c printf("%nd",x-i," ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
}
