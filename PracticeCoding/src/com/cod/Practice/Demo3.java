package com.cod.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo3
{
	public static void main(String[] args) {
		int[] l= {73,67,38,33};
		
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<l.length;i++)
		{
			int n=l[i];
			int x=l[i];
			int z=x%10;
			if(z<=5)
			{
				x=x+(5-z);
//				if((x-n)<3)
//				{
//					list.add(n);
//					continue;
//				}
			}
			else if(z<10)
			{
				x=x+(10-z);
				if((x-n)<3)
				{
					list.add(n);
					continue;
				}
			}
			
			if(x<40)
			{
				list.add(n);
				continue;
			}
			list.add(x);
		}
		for(int m:list)
		{
			System.out.println(m);
		}
	}
}
