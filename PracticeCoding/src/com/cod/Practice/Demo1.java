package com.cod.Practice;

import java.util.Scanner;

public class Demo1
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		String s1=scn.nextLine();
		String s2=scn.nextLine();
		
		String s3=s.replace(s1, s2);
		
		System.out.println(s3);
		
		
	}
}
