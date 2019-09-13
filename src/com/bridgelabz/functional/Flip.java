package com.bridgelabz.functional;

import java.util.Scanner;

public class Flip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int h = 0,t = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times u want to flip coin");
		int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(Math.random()<0.5)
			{	t++;
			System.out.println("t");
			}
			else
			{
				h++;
			System.out.println("h");
			}
		}
		int p = h*100/n;
		int p1 = t*100/n;
		System.out.println("Heads %" +p + "\n" + "Tails % " +p1 );
	}

}
