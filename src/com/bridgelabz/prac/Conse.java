package com.bridgelabz.prac;



public class Conse {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String s="abba";
			int n=s.length();
			
			char[] ch = s.toCharArray();
			for(int i=0;i<ch.length-1;i++)
			{
				if(ch[i]==ch[i+1]) {
					System.out.print(ch[i]+""+ch[i+1]+" ");
				}
				else
				{
					System.out.println();
					System.out.print(ch[i]+""+ch[i+1]);
				}
			}
			
			
	}

}
