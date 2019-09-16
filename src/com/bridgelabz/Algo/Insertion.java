package com.bridgelabz.Algo;
import com.bridgelabz.UtilityA.Utility;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {9,8,7,6,5,4,3,2,1};
		String[] arr ={"Atlanta","New York","Dallas","Omaha","San Francisco"};
		//Insertion sort for integrs
		System.out.print("Unsorted= ");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Sorted= ");
		Utility.insertion(a);
		System.out.println();
		
		//Insertion sort for strings
		String sortedArray[] = Utility.sort_sub(arr, arr.length); 
		for(int i=0;i<sortedArray.length;i++){
		System.out.println(sortedArray[i]);
		}
	}

}
