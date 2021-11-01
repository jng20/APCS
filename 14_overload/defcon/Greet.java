/**
Team Richard
Jacob Ng and Preguac, Kartik and Krrish, Vansh and Tiffany
APCS
HW14 -- Customize Your Creation
2021-10-07
Thanks to the dojo for showing me what a constructor was
**/

/**
DISCO
-I discovered what a constructor actually was (I had only been making instance variables)
-I discovered how an overloaded constructor works (a constructor that takes args)
-I discovered contructors are methods
QCC
-I don't get how to use both a constructor and overloaded constructor together
-The instance variable should be private
-I don't think I did this hw right. My team also didn't know.
-How do we give each Instance their own personal msg without an input? Is it possible without 
conditionals?
-Is there a way to get the name of the new Instance made? 
**/



public class Greet{
	public static void main(String[] args){
		String greeting;
		BigSib richard = new BigSib();
		BigSib grizz = new BigSib();
		BigSib dotCom = new BigSib();
		BigSib tracy = new BigSib();
		greeting = richard.greet("freshman");
		System.out.println(greeting);
		greeting = tracy.greet("Dr.Spaceman");
		System.out.println(greeting);
		greeting = grizz.greet("Kong Fooey");
		System.out.println(greeting);
		greeting = dotCom.greet("mom");
		System.out.println(greeting);
		
		}
		
}

/**
Word up freshman
Salutations Dr. Spaceman
Hey ya Kong Fooey
Sup mom
**/
