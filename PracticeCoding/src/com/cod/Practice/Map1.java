package com.cod.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Map1 
{
	
	public static void main(String[] args)
	{
		List<Integer>a=new ArrayList<Integer>();
			a.add(1);
			a.add(1);
			a.add(2);
			a.add(1);
			a.add(2);
			a.add(2);
			a.add(3);
			a.add(4);
		Collections.sort(a);
		List<Integer>l=new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<a.size();i++)
		{
			count=1;
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i).equals(a.get(j))) count++;
				else break;
			}
			if(count>1)
			{
				l.add(count);
				i=i+(count-1);
			}
		}
		int sum=0;
		for(int x:l)
		{
			sum=sum+x/2;
		}
		System.out.println(sum);
	}

}	
//chrome -tomacte-9 download
//click first link 
//9.0.73
//64-bit-windows Zip(pgp---


//mvn repository.com
//search servlet api
//open java servelet api
//open 4.0.1
//copy dependency
//paste it inside the pom.xml page in inside the tag of dependencies

//and search mysql connector select 8.0.30 and copy dependency paste it inside 
//the dependencies

//<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
//<dependency>
//    <groupId>mysql</groupId>
//    <artifactId>mysql-connector-java</artifactId>
//    <version>8.0.30</version>
//</dependency>



//asdfghjk123

