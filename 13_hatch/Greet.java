/**
Jacob Ng and Preguac, Kartic and Krrish
APCS
HW13 -- Where do BigSibs Come From?
2021-10-06

**/

/**
DISCO
-error: non-static variable SupMsg cannot be referenced from a static context
 The same error we saw in class. Had to remove static from the header to compile.
- For each instance of a class, the static variable would remain the same throughout all of them.
- Static can't reference non static and vice versa
-stsatic has to do with memory stuff
QCC
- When richard.setHelloMsg("Word up"); 
  only freshman appeared aka the input for greet() method
-String SupMsg;
 SupMsg = "Word up "; would not compile
**/


public class Greet {
    public static void main( String[] args ) {
        String greeting;

        BigSib richard = new BigSib();    
        //richard.setHelloMsg("Word up");	  
                                          

        greeting = richard.greet("freshman");  
    					                            
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
