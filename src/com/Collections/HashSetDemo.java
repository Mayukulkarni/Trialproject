package com.Collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args)
	{
		HashSet<String> obj=new HashSet<String>();
		obj.add("Mayuri");
		obj.add("Mahesh");
		obj.add("Mayuri");
		obj.add("Tommy");
		obj.add("tom");
		obj.add("sonu");
		System.out.println(obj); 
		for (String j:obj)  //forEachloop
		{
			System.out.println(j);
		}
				
	}

}
//Duplicate value never print
//gives output in random sequence