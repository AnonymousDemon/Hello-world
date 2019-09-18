package com.bridgelabz.Algo;

import java.util.Scanner;

import com.bridgelabz.UtilityA.Utility;

public class TempConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temp in f");
		f=sc.nextInt();
		Utility.FtoC(f);
		System.out.println("Enter temp in c");
		c=sc.nextInt();
		Utility.CtoF(c);
				

	}

}
