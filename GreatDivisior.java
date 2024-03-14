package com.advance.com.work.around;

public class GreatDivisior {

	public static void main(String[] args) {
		int num=81,num2=154;
		int gcd=1;
		for(int i=1;i<=num-1;i++) {
			if(num%i==0) {
				gcd=i;
				
			}
			
		}
		System.out.println(gcd+" "+num);
		for(int i=1;i<=num2-1;i++) {
			if(num2%i==0) {
				gcd=i;
				
			}
			
		}
		System.out.println(gcd+" "+num2);
	}

}
