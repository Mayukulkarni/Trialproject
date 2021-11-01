package com.Collections;

import java.util.ArrayList;

public class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList<String> name=new ArrayList<String>(); //Declare arraylist
		name.add("Mayuri");
		name.add("Mahesh");
		name.add("Mayuri");
		name.add("Tommy");
		
		System.out.println(name);   //print the ArrayList
		name.remove(2);       //print the value at index 2
		name.remove("Tommy");   //remove  the name tommy
		System.out.println(name);  
		System.out.println(name.size());  // print the size of arrayList
		System.out.println(name.get(1));  // get the value at index 1
		
		/*for(int i=0;i<name.size();i++)
		{
			System.out.println(name.get(i));
		}*/
	}
}
/*The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
(if you want to add or remove elements to/from an array, you have to create a new one). 
While elements can be added and removed from an ArrayList whenever you want.
*/