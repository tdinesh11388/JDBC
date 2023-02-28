package com.cod.Practice;

import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
	    System.out.println("Enter String");
	    String s1=scn.nextLine();
	    System.out.println("Enter String");
	    String s2=scn.nextLine();
	 
	    while(true)
	    {
	    	if(s1.length()!=s2.length())
	    	{
	    		System.out.println("not a anagram");
	    		break;
	    	}
	    	if(s1.length()==0 && s2.length()==0)
	    	{ 
	    		System.out.println("anagram");
	    		break;
	    	}

    		char ch1=s1.charAt(0);
    		s1=s1.replace(ch1+"","");
    		s2=s2.replace(ch1+"",""); 
	    }
	}

}
