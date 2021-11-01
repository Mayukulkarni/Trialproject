package com.Inheritance;

public class SingleInheritanceChildClass extends SingleInheritance
{

	public static void main(String[] args)
	{
		
		SingleInheritanceChildClass obj= new SingleInheritanceChildClass();
		obj.animal();
	}

}


/*single Inheritance                       * Multilevel Inheritance
 class A->Class B                           Class A
class A----Parent class                     |
class b---child class                       Class B
                                            |
                                            Class C  
                                            
  * Hierachical
             class a
        class b       class c     
                                            
 
* Multiple
Class a   class b
       class c
*/