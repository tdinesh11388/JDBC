package com.cod.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) 
	{
		int[] a = {2, 1, 1, 2, 3, 1, 1, 2};
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

		// Count frequency of each element in the array
		for (int i = 0; i < a.length; i++) {
		    if (frequencyMap.containsKey(a[i])) {
		        frequencyMap.put(a[i], frequencyMap.get(a[i]) + 1);
		    } else {
		        frequencyMap.put(a[i], 1);
		    }
		}

		// Print count for each repeated number
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
		    if (entry.getValue() > 1) {
		        System.out.println(entry.getKey() + "=" + entry.getValue());
		    }
		}

		
		
		
		
		
////		List<Integer>l=new ArrayList<Integer>();
////		l.add(30);
////		l.add(23);
////		l.add(6);
////		l.add(11);
////		l.add(45);
////		l.add(12);
////		l.add(40);
////		l.add(90);
//		int [] l= {3,4,5,6,7,8};
//		Arrays.sort(l);
//		//int x=l.size();
//		String s = l.toString();
//		int s1=s.length();
//		while(s1>0)
//		{
//			char x1=s.charAt(0);
//			String replace = s.replace(x1+"", "");
//			int count=s.length()-replace.length();
//			System.out.println(x1+"="+count);
//			s=replace;
//		}
	}

}
