package com.cod.Practice;

import java.util.Scanner;

public class Anagram5 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter string");
		String s1=scn.nextLine();
		String s2=scn.nextLine();
		String s3="";
		char[] c = s2.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.indexOf(j)!=-1)
				{
					continue;
				}else {
					c[j]='0';
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='0')
			{
				s3=s3+c[i]+"";
			}
		}
		System.out.println(s1);
		System.out.println(s3);
	}
}
