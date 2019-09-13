package com.bridgelabz.functional;

import java.util.Scanner;

public class Po2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		n= sc.nextInt();
		int a[][] = new int[0][n];
		int  N=(int) Math.pow(2, n);
		for(int i=1;i<=N;i++)
		{
			int m = (int) Math.pow(i, 2);
			
			System.out.print(m+" ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + "");
			System.out.println();
		}
		
		
	}

}
