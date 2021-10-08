/**
Jacob Ng and Preguac, Kartik and Krrish
APCS
HW14 -- Customize Your Creation
2021-10-07

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


public class Greet{
	public static void main(String[] args){
		String greeting;
		BigSib richard = new BigSib();
		BigSib grizz = new BigSib();
		BigSib dotCom = new BigSib();
		BigSib tracy = new BigSib();
		greeting = richard.greet("freshman");
		System.outprintln(greeting);
		greeting = tracy.greet("Dr.Spaceman");
		System.outprintln(greeting);
		greeting = grizz.greet("Kong Fooey");
		System.outprintln(greeting);
		greeting = dotCom.greet("mom");
		System.outprintln(greeting);
		
		}
		
}


