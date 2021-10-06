/**
Jacob Ng and Preguac, Kartic
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05
Huge and I mean Huge thanks to Kirsten and Paul at the dojo. They opened my eyes.
**/

/**
DISCO
-setHelloMsg does not need to be a string
-setHelloMsg can be a function that already prints a string (bigsib9 hw)
-global variables 
-how to make greet print the HelloMsg and the name
QCC
-richard.greet("freshman") must be a string (bigsib10hw)
-richard.greet("freshman") is really BigSib.greet("freshman");
-so greeting is really BigSib.greet("freshman");
-BigSib richard has the properties of BigSib.java
-setHelloMsg is a method in BigSib.java
-what is static?
-Before I realized the setHelloMsg method should print the string instead of returning one
(thank you Kirsten),I thought greet would print both the setHelloMsg string input
and the greet input together. Thanks to Paul, I learned it was possible to do that
but it would require global variables and more knowledge about object properties/attributes

**/


public class BigSib{

	public static String greet(String name){
	
		return name;
	}
	
	
	
	public static void setHelloMsg(String msg){
		System.out.print(msg + " ");
	}
}


