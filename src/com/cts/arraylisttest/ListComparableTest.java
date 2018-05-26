package com.cts.arraylisttest;

import java.util.ArrayList;
import java.util.Collections;

import com.cts.arraylist.ListComparable;

public class ListComparableTest {
	
		public static void main(String args[]){
			   ArrayList<ListComparable> arraylist = new ArrayList<ListComparable>();
			   arraylist.add(new ListComparable(223, "Chaitanya", 26));
			   arraylist.add(new ListComparable(245, "Rahul", 24));
			   arraylist.add(new ListComparable(209, "Ajeet", 32));

			   Collections.sort(arraylist);

			   for(ListComparable str: arraylist){
					System.out.println(str);
			   }
			}
	}

