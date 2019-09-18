package com.bridgelabz.Algo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.UtilityA.Utility;

public class BubbleIo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		File f = new File("/home/admin0/eclipse-workspace/Java/src/com/bridgelabz/Algo/Binary");
		FileReader fr = new FileReader(f);
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(fr);
		String st;
		while((st=br.readLine())!=null)
		{
			System.out.println(st);
			break;
		}
		//split string 
		String[] str = st.split(",");
		System.out.println("Unsorted");
		//print unsorted string array
        for (int j = 0; j < str.length; j++) {
        System.out.println(str[j]);
        }
        Utility.bubbleS(str);//using bubble sort
        sc.close();
	}

}
