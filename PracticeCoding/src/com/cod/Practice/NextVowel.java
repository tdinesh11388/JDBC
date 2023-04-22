package com.cod.Practice;

import java.util.Scanner;

public class NextVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter character");
		vowel(s.next().charAt(0));
		
		

	}
	static void vowel(char c) {
		c++;
		for(char c1=c;c1<='z';c1++) {
			if(checkVowel(c1)) {
				System.out.println(c1);
				return;
			}
			
		}
		 
	}
	static boolean checkVowel(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'|| c=='u') {
			return true;
		}
		return false;
	}

}
