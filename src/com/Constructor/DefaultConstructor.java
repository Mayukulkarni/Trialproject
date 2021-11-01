package com.Constructor;

public class DefaultConstructor
{
	int a;
	public DefaultConstructor()  //this is constructor
	{
		a=5;
		//System.out.println(a);
	}
	public static void main(String args[])
	{
		DefaultConstructor obj=new DefaultConstructor();// this line constructor is called
		System.out.println(obj.a);
		
	}

}



/* A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
* Note that the constructor name must match the class name, and it cannot have
* a return type (like void).
*
* Also note that the constructor is called when the object is created.
*
* All classes have constructors by default: if you do not create a class
* constructor yourself, Java creates one for you. However, then you are not
* able to set initial values for object attributes.
*
*
*/