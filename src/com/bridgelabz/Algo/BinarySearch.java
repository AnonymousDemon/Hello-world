package com.bridgelabz.Algo;

import java.util.Scanner;

import com.bridgelabz.UtilityA.Utility;

public class BinarySearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int a[]= {1,3,8,98};
		 String[] arr = { "contribute", "geeks", "ide", "practice"}; 
	        String x = "id"; 
		Scanner scanner = new Scanner(System.in);
	
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enter a number to search");
		int n = scanner.nextInt();
		//Binary search for integer
		int result = Utility.binarySearch(a,0,a.length-1,n);  
	        if (result == -1)  
	            System.out.println("Element is not found!");  
	        else  
	            System.out.println("Element is found at index: "+result);  
	        scanner.close();
	  //Binary search for Strings
        int result1 = Utility.binarySearch(arr, x); 
	        
	        if (result1 == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println(x+" Element found at "
	                              + "index " + result1); 
	}

}
