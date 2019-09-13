package com.bridgelabz.prac;

import java.util.Scanner;

public class Prime {

	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <Math.sqrt(n); i++) {  
	           if (n%i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   } 
	   public static void isPalindrome(int n)
	   {
		   if(isPrime(n))
		   {
			   int r,rev=0,m=n;
			   
			   while(m>0)
			   {
			   r =m/10;
			   rev = rev *10+r;
			   m=m/10;
			   }
			   if(m==rev)
			   {
				   System.out.println(rev);
			   }
		   }
	   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		n=sc.nextInt();
		
		 if (isPrime(n))
		 {  
	           System.out.println(n + " is a prime number");  
	      }
		 else 
		 {  
	           System.out.println(n + " is not a prime number");  
	       }  
		 for(int i=2;i<=1000;i++)
		 {
			 if(isPrime(i))
			 {
				 System.out.println(i);
			 }
		 }
//		 for(int i=2;i<=1000;i++)
//		 {
//			 if(isPalindrome())
//			 {
//				 System.out.println(i);
//			 }
//		 }
		 sc.close();
	}

}
