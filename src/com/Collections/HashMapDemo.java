package com.Collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		HashMap<String,String> obj=new HashMap <String,String>();
		obj.put("Maharashtra", "Mumbai");
		obj.put("Gujrat", "Ahemdabad");
		obj.put("Rajasthan", "Jaipur");
		obj.put("Gujrat", "Ahemdabad");
		System.out.println(obj);
		System.out.println(obj.get("Maharashtra"));
		//obj.clear();
		//System.out.println(obj);
		
		for(String j:obj.keySet())  //to print keys
		{
			System.out.println(j);
		}
		for(String j:obj.keySet())  //to print keys
		{
			System.out.println(j);
		}
		for(String j:obj.keySet())  //to print keys and value
		{
			System.out.println(j+" "+obj.get(j));
		}
		

	}

}

// iterator

/*
* Stores
* In HashMap we store a key-value pair.
* It maintains the mapping of key and value.
* In HashSet, we store objects.

Duplicate values
In Hashmap -It does not allow duplicate keys, but duplicate values are allowed.
Hashset- It does not allow duplicate values.

Null values
Hashmap: It can contain a single null key and multiple null values.
Hashset: It can contain a single null value.

* A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
One object is used as a key (index) to another object (value).
 It can store different types: String keys and Integer values,
  or the same type, like: String keys and String values:
*/
