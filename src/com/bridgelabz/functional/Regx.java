package com.bridgelabz.functional;

import java.util.Scanner;

public class Regx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello" + " <<UserName>>"+" How "+"are "+"you";
		String str2;
		Scanner sc = new Scanner(System.in);
		System.out.println(str);
	
		System.out.println("Enter the name you want to replace");
		str2 = sc.nextLine();
//		char[] ch = str.toCharArray();
//		char[] ch2 = str2.toCharArray();
		str =str.replaceAll("<<UserName>>",str2);
		System.out.println("After replacing\n"+str);
	}

}
