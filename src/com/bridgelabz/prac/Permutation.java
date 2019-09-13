package com.bridgelabz.prac;

import java.util.ArrayList;

public class Permutation {

	   public static void generatePermutation(String str, int start, int end)  
	    {  
	        //Prints the permutations  
	        if (start == end-1)  
	            System.out.println(str);  
	        else  
	        {  
	            for (int i = start; i < end; i++)  
	            {  
	                //Swapping the string by fixing a character  
	                str = swapString(str,start,i);  
	                //Recursively calling function generatePermutation() for rest of the characters   
	                generatePermutation(str,start+1,end);  
	                //Backtracking and swapping the characters again.  
	                str = swapString(str,start,i);  
	            }  
	        }  
	    }  
	   public static String swapString(String a, int i, int j) {  
	        char[] b =a.toCharArray();  
	        char ch;  
	        ch = b[i];  
	        b[i] = b[j];  
	        b[j] = ch;  
	        return String.valueOf(b);  
	    }  


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "abc";  
		 Permutations p = new Permutations();
	        int len = str.length();  
	        System.out.println("All the permutations of the string are: ");  
	        generatePermutation(str, 0, len);  
	        System.out.println("Iterative method");
	        p.permutations(str);
	
}
}
class Permutations {

	// Iterative function to generate all permutations of a String in Java
	// using Collections
	public void permutations(String s)
	{
		// create an empty ArrayList to store (partial) permutations
		ArrayList<String> partial = new ArrayList<String>();

		// initialize the list with the first character of the string
		partial.add(String.valueOf(s.charAt(0)));

		// do for every character of the specified string
		for (int i = 1; i < s.length(); i++)
		{
			// consider previously constructed partial permutation one by one

			// (iterate backwards to avoid ConcurrentModificationException)
			for (int j = partial.size() - 1; j >= 0 ; j--)
			{
				// remove current partial permutation from the ArrayList
				String str = partial.remove(j);

				// Insert next character of the specified string in all
				// possible positions of current partial permutation. Then
				// insert each of these newly constructed string in the list

				for (int k = 0; k <= str.length(); k++)
				{
					// Advice: use StringBuilder for concatenation
					partial.add(str.substring(0, k) + s.charAt(i) +
								str.substring(k));
				}
			}
		}

		System.out.println(partial);
	}
}