package com.cod.Practice;

import java.util.Scanner;

public class RemoveDuplicates
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		String s=scn.nextLine();
		
		String []s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					s1[j]="0";
				}
			}
		}
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!="0")
			{
				System.out.println(s1[i]);
			}
		}
	}
}
