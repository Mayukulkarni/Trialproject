package com.abstraction;

public class ChildAbstractClass extends WithAbstractClassDemo
{
	public void method1()
	{
		System.out.println("world");
	}
	public static void main(String[] args) 
	{
		ChildAbstractClass obj=new ChildAbstractClass();
		obj.method1();
		obj.method2();
		
	}

}
