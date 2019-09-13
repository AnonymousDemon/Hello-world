package com.bridgelabz.functional;

public class S02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,-1,3,-3,2,-5,0,-4};
		int n=a.length;
		int i,j,k;
		for(i=0;i<n-2;i++)
		{
			for(j=i+1;j<n-1;j++)
			{
				for(k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println("["+a[i]+" "+a[j]+" "+a[k]+"]"+"\n");
					}
				}

			}

		}
	}

}
