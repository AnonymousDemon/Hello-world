package com.bridgelabz.prac;

import java.util.Scanner;

public class FirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc =new Scanner (System.in); 
		System.out.println("Enter a no");
		n=sc.nextInt();
		int f,l,r,rev=0;
		f=n%10;
		while(n>0)
		{
			r=n%10;
			rev = rev * 10 + r;
			n=n/10;
		}
		l=rev%10;
		int result = f+l;
		System.out.println("Sum of first and last = " +result);
	}

}
