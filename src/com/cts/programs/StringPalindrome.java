package com.cts.programs;

public class StringPalindrome {
	public void string(String str1) {

		StringBuffer str2 = new StringBuffer();// StringBuffer used to initialize str2;
		for (int i = str1.length(); i > 0; i--) {
			str2.append(str1.substring(i - 1, i)); // substring is used to get position;
		}
		System.out.println(str1.equals(str2.toString()));// tostring is used to convert stringbuffer to string;
	}

}
