package com.bridgelabz.prac;

public class cons {


	// Method to print n equal parts of str 
    static void divideString(String str, int n) 
    { 
    int str_size = str.length(); 
    int part_size; 
   
      
    // Calculate the size of parts to find  
    // the division points 
    part_size = str_size / n; 
    
    // Check if string can be divided in 
    // n equal parts  
    if (str_size % n != 0) 
    { 
    	for (int i = 0; i< str_size; i++) 
        { 
            if(i % part_size == 0) 
                System.out.println();  
            System.out.print(str.charAt(i)); 
        }
    }      
//    for (int i = 0; i< str_size; i++) 
//    { 
//        if(i % part_size == 0) 
//            System.out.println();  
//        System.out.print(str.charAt(i)); 
//    } 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// length od string is 28 
        String str = "abababa"; 
      
        // Print 4 equal parts of the string 
        divideString(str, 2); 
	}

}
