package com.cts.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListInteger {
	public boolean integerId(List<Integer> list, int a) {
		//what is a and what is ss?
		for (Integer ss : list) {
			if (ss == a) {
				return true;
			}
			
		}return false;
		}

	
	//do not use main method in this class.
public static void main(String[]args)

{	ArrayListInteger emp=new ArrayListInteger();
	List<Integer> ss=new ArrayList<Integer>();
	ss.add(1);
	ss.add(2);
	ss.add(3);
	ss.add(4);
	ss.add(5);
	ss.add(6);
	
	
	System.out.println("the integer value are:"+ss);
	
	System.out.println(emp.integerId(ss, 8));

	
			Iterator ite=ss.iterator();
	while(ite.hasNext())
	{
		System.out.println(ite.next());
	}
	
	for(Integer num:ss)
	{
		System.out.println("enhanced order:"+num);
		
		}
	
}
	
	

}
