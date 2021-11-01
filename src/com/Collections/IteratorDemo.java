package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{

	public static void main(String[] args) 
	{
		//Declaring ArrayList
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(10);
		a.add(25);
		a.add(30);
		a.add(90);
		a.add(46);
		 
		//Declaring iterator
		Iterator<Integer>b=a.iterator();
		//System.out.println(b.next());//to print first element
		//System.out.println(b.next());
		//System.out.println(a.get(4));
		while(b.hasNext())//hashnext- if there is next elements in my loop then print it
		{
			System.out.println(b.next());
		}
	}
	
}
/*
* An Iterator is an object that can be used to loop through collections, like
* ArrayList and HashSet. It is called an "iterator" because "iterating" is the
* technical term for looping.
*
* To use an Iterator, you must import it from the java.util package.
*/