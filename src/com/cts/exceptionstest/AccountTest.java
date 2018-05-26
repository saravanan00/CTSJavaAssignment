package com.cts.exceptionstest;

import com.cts.trycatch.CheckedException;
import com.cts.trycatch.MinimumBalanceException;

public class AccountTest {
	public static void main(String[]args)
	{
		CheckedException checkedexceptions=new CheckedException();
		try {
			System.out.println(checkedexceptions.withdraw(6000));
					}catch(MinimumBalanceException e)
		{
						e.printStackTrace();
		}
	}

}
