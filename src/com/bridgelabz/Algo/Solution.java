package com.bridgelabz.Algo;


import java.util.Scanner;


public class Solution {

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("enter no of task");
		int tasks = s.nextInt();
		int[] dead = new int[tasks] ;
		int[] min = new int[tasks] ;
		for (int i = 0; i < min.length; i++) {
			System.out.println("task " +i+ " time");
			min[i] = s.nextInt();
			System.out.println("task "+i+" deadline");
			dead[i] = s.nextInt();
		}
	}
	

}
