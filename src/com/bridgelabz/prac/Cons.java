package com.bridgelabz.prac;

public class Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="acaccbaa";
		System.out.println("string ="+str);
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				System.out.print("");
						
			}
			else
			{
				System.out.print(ch[i]+""+ch[i+1]+"\n");
				
			}
		}
		
	}

}
