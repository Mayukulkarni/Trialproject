package com.EncapsulationDemo;

public class EncapsulationChild extends EncapsulationD
{
	public static void name (String []args)
	{
		EncapsulationChild obj= new EncapsulationChild();
		obj.setName("Mayuri");
		obj.getName();
		System.out.println(obj.getName());
	}

	
}

/*
* The get method returns the value of the variable name.
*
* The set method takes a parameter (newName) and assigns it to the name
* variable. The this keyword is used to refer to the current object.
*/



/*
* Better control of class attributes and methods Class attributes can be made
* read-only (if you only use the get method), or write-only (if you only use
* the set method) Flexible: the programmer can change one part of the code
* without affecting other parts Increased security of data
*/