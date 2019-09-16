package com.bridgelabz.Algo;

import java.util.Scanner;

import com.bridgelabz.UtilityA.Utility;

public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt("4");
		int range = (int) Math.pow(2, n);
		System.out.println("Range is 0 to " + range);
		Utility.magicNumber(range);
		
		sc.close();
	}

}
