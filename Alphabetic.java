package com.advance.com.work.around;

public class Alphabetic {

	public static void main(String[] args) {
		char ch='$';
		String output=(ch>='a'&&ch<='z' ||ch>='A'&&ch<='Z')
				      ? ch + " is an albhabet"
				      : ch + " is not an alphabet";
		System.out.println(output);
		

	}

}
