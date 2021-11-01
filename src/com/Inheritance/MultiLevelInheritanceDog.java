package com.Inheritance;

public class MultiLevelInheritanceDog extends MultiLevelInheritanceAnimal
{
	public void color() 
	{
		System.out.println("Red");
	}
	public static void main(String[] args)
	{
		
		MultiLevelInheritanceDog obj= new MultiLevelInheritanceDog();
		obj.eat();

	}
}