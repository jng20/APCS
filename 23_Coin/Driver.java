/*
Fish and Guac
Jacob Ng, Gloria Lee
APCS
HW24 -- Get It While You Can
2021-10-25
time spent: 
*/

/*
DISCO
-you 2 loops instead of one because the conditional matchCtr < 65536 && matchCtr%2004 != 0 is unreachable
-
QCC
-
Post-v0 Mods
-
*/
public class Driver {

  public static void main( String[] args ) {
	int matchCtr;
	matchCtr = 0;
	
	Coin first = new Coin("dollar", "heads");
	Coin second = new Coin("dollar", "heads");
	
	while(matchCtr < 65536){
		first.flip();
		second.flip();
		if ( first.equals(second) ) {
        		matchCtr++;
      		}	
	}
	while (matchCtr%2004 != 0){
		first.flip();
		second.flip();
		if ( first.equals(second) ) {
        		matchCtr++;
      		}
	}
	System.out.println(matchCtr);
	
	
    /*top  
    //build Objects from blueprint specified by class Coin


    //test default constructor

      Coin mine = new Coin();

      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );

      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );

      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);

      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);

      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      
      ====================BOTTOM======================*/

  }//end main()

}//end class
