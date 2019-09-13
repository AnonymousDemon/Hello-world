package com.bridgelabz.prac;

import java.util.Scanner;

public class Windchill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double t,v;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature");
		t=sc.nextDouble();
		System.out.println("Enter velocity");
		v=sc.nextDouble();
		if(t>50||(v<3||v>120))
		{
			System.out.println("invalid input");
		}
		else
		{
			double temp=(t-32)*5/9;
			double miles = (v/1.609);
			double x = Math.pow(miles, 0.16);
			double res=35.74+0.6215*temp+(0.4275*temp-35.75)*x;
			System.out.println("Temperature = " + temp+" C");
	        System.out.println("Wind speed  = " + miles+" miles");
	        System.out.println("Wind chill  = " + res);
			
		}
	}

}
