package com.bridgelabz.functional;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x");
		x=sc.nextInt();
		System.out.println("Enter value of y");
		y=sc.nextInt();
		int z=x*x+y*y;
		double res=Math.sqrt(z);
		System.out.println("Euclidean distance ="+res);
	}

}
