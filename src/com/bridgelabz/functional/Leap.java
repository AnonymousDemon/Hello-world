package com.bridgelabz.functional;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		n=sc.nextInt();
		if(n>9999||n<1000)
		{
			System.out.println("Invalid Year");
		}
		else
		{
			if((n%4==0&&n%100!=0)||n%400==0)
				System.out.println("Leap year");
			else
				System.out.println("Not leap year");
		}
	}

}
