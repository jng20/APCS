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
-Static notes came from Andrew from the dojo
QCC
- When richard.setHelloMsg("Word up"); 
  only freshman appeared aka the input for greet() method
-String SupMsg;
 SupMsg = "Word up "; would not compile
**/


public class BigSib{

	String SupMsg;
	richard.SupMsg = "word up ";
	grizz.SupMsg = "Hey ya ";
	dotCom.SupMsg = "Sup ";
	tracy.SupMsg = "Salutations ";
	
	public String greet(String name){
	
		return SupMsg + name;
	}
	
	
	
	//public void setHelloMsg(String msg){
	//	msg = SupMsg;
	//}
}


