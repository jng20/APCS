/**
Baked Potatoes Emily Ortiz and Apple Juice, Vansh Saboo and Tiffany,
Jacob Ng and Preguac
APCS
HW10 -- Refactor Big Sib One
2021-10-04
Big thanks to Kitty, Gabriel, and Stanley at the dojo
**/

/**
Discoveries
-Greet.java:21: error: 'void' type not allowed here
        System.out.println( BigSib.greet("Crosby") ); 
when greet method still had println and void
-You can directly use the variable name in the parameter.
-You have to return a string and not void.
-you can still concatenate strings when you're returning a string
Unresolved questions
- When/why would we use this version of Greet?
**/


public class BigSib{

	public static String greet(String name){
		return "Why, hello there, " + name + ". How do you do?";
	}
}


