/**
Jacob Ng
APCS
HW08 -- Refactor Freshi Zero
2021-09-30
**/

/**
Discoveries
-when putting in a string for a parameter for a method, you have to put it in quotes. 
refer to lines 34,35,36.

Unresolved questions
-in the parameter for the method greet, don't we need a name for variable string?
-Were we supposed to use string concatenation?
**/


public class Greet{

	public static void greet(String a){
		String name;
		name = a;
		System.out.println("Why, hello there, " + name + ". How do you do?");
	}







	public static void main(String[] args){
		greet("Bob");
		greet("Joe");
		greet("Greg");
	}
}
