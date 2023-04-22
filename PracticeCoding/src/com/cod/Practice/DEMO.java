package com.cod.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DEMO
{
	public static void main(String[] args) {
		int []a= {1,2,3,4,1,2,2,3,4};
		
		List<Integer>l=new ArrayList<>();
		for(int i=0;i<=a.length-1;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])count++;
			}
			l.add(count);
		}
		Collections.sort(l);
		for(int i=l.size()-1;i>=0;i--)
		{
			System.out.println(l.get(i));
		}
	}
}
