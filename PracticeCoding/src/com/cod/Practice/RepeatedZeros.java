package com.cod.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RepeatedZeros {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		String s=scn.nextLine();
		ArrayList<Integer>l=new ArrayList<>();
		int a=0;
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='0')
			{
				a++;
			}
			else{
			
				l.add(a);
				a=0;
			}
		}	
		if(a!=0)l.add(a);
		Collections.sort(l);
//
//		for(int i=l.size()-1;i>=0;i--)
//		{
//			System.out.println(l.get(i));
//			
//		}
		for(int x:l)
		{
			System.out.println(x);
		}
	}

}
