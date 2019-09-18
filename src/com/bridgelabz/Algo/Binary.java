package com.bridgelabz.Algo;

import java.util.Scanner;

public class Binary {

	public static int SwapNibbles(int y)
	{
		 
		
		int  x = (((y & 0x0F) << 4) |((y & 0xF0) >> 4));
		System.out.println("Integer value "+x);	
		return  x; 
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		n=sc.nextInt();
		String x="";
		int b = n;
		if(n>255)
		{
			System.out.println("Invalid input");
		}
		else
		{
			
		while(n>0)
		{
			a=n%2;
			x = a + "" + x;
			n=n/2;
		}
		
		
		System.out.println("Binary is = " +x);
		Binary.SwapNibbles(b);
		}
		sc.close();
	}

}
