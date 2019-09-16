package com.bridgelabz.Algo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.UtilityA.Utility;

public class BinaryIo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		File f = new File("/home/admin0/eclipse-workspace/Java/src/com/bridgelabz/Algo/Binary");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String st;
		while((st=br.readLine())!=null)
		{
			System.out.println(st);
			break;
		}
		String[] str = st.split(",");
		Utility.bubbleS(str);
		System.out.println("Enter a string to search");
		String x=sc.nextLine();
		Utility.binarySearch(str, x);
	}

}
