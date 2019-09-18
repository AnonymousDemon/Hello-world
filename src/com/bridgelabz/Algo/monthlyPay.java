package com.bridgelabz.Algo;

import java.util.Scanner;

public class monthlyPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double P,Y,R;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter monthly paymnts");
		P=scanner.nextDouble();
		System.out.println("Enter year");
		Y=scanner.nextDouble();
		System.out.println("Enter rate 0f interst");
		R=scanner.nextDouble();
		double r =R/12*100;
		System.out.println(r);
		double n = Y*12;
		System.out.println(n);
		double x = Math.abs(Math.pow((1+r), -n));
		System.out.println(x);
		double pay= P*r/(1-x);
		System.out.println(pay);
		scanner.close();
	}

}
