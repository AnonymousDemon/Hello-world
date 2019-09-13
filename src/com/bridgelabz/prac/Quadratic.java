package com.bridgelabz.prac;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a,b,c for equation (a*x*x+b*x+c)");
		
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		int d = b*b-4*a*c;
		double delta = Math.abs(d);
		double r1 = (-b+Math.sqrt(delta))/2*a;
		double r2 = (-b-Math.sqrt(delta))/2*a;
		System.out.println("Root 1= "+r1+"\n"+"Root 2=" +r2);
		sc.close();
	}

}
