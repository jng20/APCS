/**
Baked Potatoes Emily Ortiz Vansh Saboo
Jacob Ng and Preguac
APCS
HW09 -- What Are BigSibs Good For?
2021-09-30
**/

/**
Discoveries
-when putting in a string for a parameter for a method, you have to put it in quotes. 
refer to lines 35,36,37.
-2 files can have the same name and different content as long as they're in different directories.

Unresolved questions
-in the parameter for the method greet, don't we need a name for parameter String?
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
