package com.cod.Practice;

public class HeighstPalindrome
{
	public static void main(String[] args)
	{
		isPalindrome("malayalam");
	}
	public static void isPalindrome(String s)
	{
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(palindrome(s,i,j))
				{
					System.out.println(s.substring(i, j+1));
				}
			}
		}
	}
	public static boolean palindrome(String s,int i,int j)
	{
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
}
