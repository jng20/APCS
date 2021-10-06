/**
Jacob Ng and Preguac, Kartic
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05

**/

/**
DISCO
-setHelloMsg does not need to be a string
-setHelloMsg can be a function that already prints a string (bigsib9 hw)

QCC
-richard.greet("freshman") must be a string (bigsib10hw)
-richard.greet("freshman") is really BigSib.greet("freshman");
-so greeting is really BigSib.greet("freshman");
-BigSib richard has the properties of BigSib.java
-setHelloMsg is a method in BigSib.java
**/


public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();    // BigSib richard has the properties of BigSib.java
    richard.setHelloMsg("Word up");	  // setHelloMsg is a method in BigSib.java
                                      // setHelloMsg does not need to be a string
                                      // setHelloMsg can be a function that already prints a string (bigsib9 hw)

    greeting = richard.greet("freshman");  // richard.greet("freshman") must be a string (bigsib10hw)
    					                             // richard.greet("freshman") is really BigSib.greet("freshman");
    					                             // so greeting is really BigSib.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet


/**
Output
Word up freshman
Salutations Dr. Spaceman
Hey ya Kong Fooey
Sup mom
**/
