package com.EncapsulationDemo;

public class EncapsulationD
{

	//public String name; //data is not secure
	private String Newname;

	public String getName() //to get the value of name
	{
		return Newname;
	}

	public void setName(String name)//to set value to name
	{
		this.Newname = name;
	}
}


/*Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable

 */