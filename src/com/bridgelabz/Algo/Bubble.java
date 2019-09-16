package com.bridgelabz.Algo;

import com.bridgelabz.UtilityA.Utility;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {9,8,7,6,5,4,3,2,1};
		String str[] = { "sachin", "kalya", "ravya", "vicky", "namya","avi"};
		System.out.print("Unsorted= ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Sorted= ");
		Utility.bubbleS(a);
		System.out.println();
		Utility.bubbleS(str);
	}

}
