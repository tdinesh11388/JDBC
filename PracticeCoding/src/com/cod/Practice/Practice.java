package com.cod.Practice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("vamsi"));
	if(	palindrome("madam")) {
		System.out.println("yes");
	}
	else System.out.println("no");

	}
	static String reverse(String s) {
		char[] c=s.toCharArray();
		int i=0,j=c.length-1;
		while(i<j) {
			char c1=c[i];
			c[i]=c[j];
			c[j]=c1;
			i++;
			j--;
		}
		return new String(c);
	}
	static boolean palindrome(String s) {
		char[] c=s.toCharArray();
		int i=0,j=c.length-1;
		while(i<j) {
			if(c[i]!=c[j]) return false;
			i++;
			j--;
		}
		return true;
	}
	

}
