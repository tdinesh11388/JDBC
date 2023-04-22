package com.cod.Practice;

import java.util.Scanner;

public class RemoveDuplicatesWithOutInBuiltMethods
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		String s=scn.nextLine();
		System.out.println(remove(s));
	}
	public static String remove(String s)
	{
		char[] c = s.toCharArray();
		String s1="";
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]='0';
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='0')
			{
				s1=s1+c[i];
			}
		}
		return new String(s1);
	}

}
