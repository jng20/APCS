/**
Jacob Ng and Preguac, Kartik and Krrish
APCS
HW14 -- Customize Your Creation
2021-10-07

**/

/**
DISCO

QCC

**/


public class Greet{
	public static void main(String[] args){
		String greeting;
		BigSib richard = new BigSib("word up");
		BigSib grizz = new BigSib("Hey ya");
		BigSib dotCom = new BigSib("Sup");
		BigSib tracy = new BigSib("Salutations");
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


/**
Output
Word up freshman
Salutations Dr. Spaceman
Hey ya Kong Fooey
Sup mom
**/
