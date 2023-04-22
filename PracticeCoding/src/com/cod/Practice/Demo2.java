package com.cod.Practice;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		String u="";
		String l="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				u=u+ch;
			}else {
				l=l+ch;
			}
		}
		String res=l+u;
		System.out.println(res);
	}

}
