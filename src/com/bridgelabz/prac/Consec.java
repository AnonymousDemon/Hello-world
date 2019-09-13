package com.bridgelabz.prac;

public class Consec {
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]=new String[3];
	    arr[0]="Google";
	    for(int i=0;i<arr.length;i++)
	    {
	        int j;
	        for(j=1;j<arr[i].length();j++)
	        {
	            if(arr[i].charAt(j) == arr[i].charAt(j-1))
	            {
	                break;
	            }
	        }
	        if(j==arr[i].length())
	                System.out.println(arr[i]);
	    }
	    
	}

}
