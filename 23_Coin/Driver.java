/*
Fish and Guac
Jacob Ng, Gloria Lee
APCS
HW23 -- What Does Equality Look Like?
2021-10-23
time spent: 1.5
*/

/*
DISCO
-You don't need to use .toString() to call the toString() method
-To use Math.random and Math.round you don't need to import a library
-Math.random will produce a double on the interval [0.0, 1.0)
-We discovered what precond and postcond means
-When you put something at the end of an if else statement, it will never run. It is unreachable.
QCC
-How were we supposed to finish in half an hour???
-How much time did sir Gabriel spend on his hw?
-What does equality look like?
-
*/
public class Driver {

  public static void main( String[] args ) {

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
      /*top
      ====================BOTTOM======================*/

  }//end main()

}//end class
