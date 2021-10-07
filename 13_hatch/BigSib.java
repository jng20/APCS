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
-Static notes came from Andrew from the dojo
QCC
- When richard.setHelloMsg("Word up"); 
  only freshman appeared aka the input for greet() method
-String SupMsg;
 SupMsg = "Word up "; would not compile
**/


public class BigSib{

	public BigSib() {
		SupMsg = "Word up ";
	}
	
	public String greet(String name){
	
		return SupMsg + name;
	}
	
	
	
	//public static void setHelloMsg(String msg){
		
	//}
}


