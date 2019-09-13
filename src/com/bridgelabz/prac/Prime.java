package com.bridgelabz.prac;

import java.util.ArrayList;
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
	   public static int[] count(int n) {
			int[] count = new int[10];
			int temp = n;
			while (temp != 0) {
				int r = temp % 10;
				count[r]++;
				temp = temp / 10;
			}
			return count;
		}
	   public static boolean anagram(int n1, int n2) {
			int[] n1count = count(n1);
			int[] n2count = count(n2);
			for (int i = 0; i < n2count.length; i++) {
				if (n1count[i] != n2count[i]) {
					return false;
				}
			}
			return true;
		}
	   public static boolean isPallindrome(int n) 
	   {
			int temp = n;
			int sum = 0;
			while (temp != 0) 
			{
				int r = temp % 10;
				sum = sum * 10 + r;
				temp = temp / 10;
			}
			if (sum == n) 
			{
				return true;
			}
			return false;
		}
	   /**
		 * Function helping prime() to check if prime is pallindrome and print it
		 */
		public static void primePallindrome() {
			System.out.println();
			boolean b;
			for (int j = 2; j <= 1000; j++) {
				b = true;
				for (int i = 2; i < j / 2; i++) {
					if (j % i == 0) {
						b = false;
						break;
					}
				}
				if (b && isPallindrome(j))
					System.out.print(j + " ");
			}
		}

		/**
		 * Function to check if no is anagram or not
		 */
		public static void primeAnagrams() {
			ArrayList<Integer> ar = new ArrayList<Integer>();
			System.out.println();
			boolean b;
			for (int j = 2; j <= 1000; j++) {
				b = true;
				for (int i = 2; i < j / 2; i++) {
					if (j % i == 0) {
						b = false;
						break;
					}
				}
				if (b)
					ar.add(j);
			}
			for (int i = 0; i < ar.size(); i++) {
				for (int j = i + 1; j < ar.size(); j++) {
					if (anagram(ar.get(i), ar.get(j))) {
						System.out.println(ar.get(i) + "  " + ar.get(j));
					}
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Prime p = new Prime();
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
		 System.out.println("Prime Anagrams");
		 Prime.primeAnagrams();
		 System.out.println("Prime Palin");

		 Prime.primePallindrome();
		 sc.close();
	}

}
