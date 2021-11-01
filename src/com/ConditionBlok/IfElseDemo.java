package com.ConditionBlok;

public class IfElseDemo {

	public static void main(String args[])
	{
		/*int time=20;
		if(time<=20)
			{
				System.out.println("Good morning");
			}
		else if(time>20)
			{
				System.out.println("good evening");
			}
		
			{
				System.out.println("Good night");
			}*/
		
		
		int marks=94;
		if(marks>65 && marks>=80)
		{
			System.out.println("First class");
		}
		else if(marks>35 && marks<=65)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		
		
		
		
	}

}
/*marks>65 to 80=1st class
  35to65 pass
  <35 fail
 */


/*Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed

Syntax

if (condition) {
// block of code to be executed if the condition is true
} else {
// block of code to be executed if the condition is false
}
*/