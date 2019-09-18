package com.bridgelabz.Algo;

import java.util.Scanner;

public class dayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m ,d, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day");
		d=sc.nextInt();
		System.out.println("Enetr month");
		m=sc.nextInt();
		System.out.println("Enter year");
		y=sc.nextInt();
		int y1 = y - (14 - m) / 12;
		int x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		int m1 = m + 12 * ((14 - m) / 12) - 2;
		int d1 = (d + x + 31 * m1/ 12) % 7;
		System.out.println("res"+d1);
		switch(d1) {
		case 0:System.out.println("Sun");
		break;
		case 1:System.out.println("Mon");
		break;
		case 2:System.out.println("tue");
		break;
		case 3:System.out.println("wed");
		break;
		case 4:System.out.println("thus");
		break;
		case 5:System.out.println("fri");
		break;
		case 6:System.out.println("sat");
		break;
			default : System.out.println("invalid");
		}
				

		}

}
