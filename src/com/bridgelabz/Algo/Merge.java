package com.bridgelabz.Algo;

import com.bridgelabz.UtilityA.Utility;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int arr[] = {12, 11, 13, 5, 6, 7};
	        int i=0;
	        System.out.println("Given array is");
	 
	        for(i=0; i<arr.length; i++)
	            System.out.println(arr[i]+" ");
	 
	        Utility.mergeSort(arr);
	 
	        System.out.println("\n");
	        System.out.println("Sorted array is");
	 
	        for(i=0; i<arr.length; i++)
	            System.out.print(arr[i]+" ");
	    }
	}


