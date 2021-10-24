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
public class Coin {

  //attributes aka instance vars
  double value;
  String upFace;
  String name;
  int flipCtr;
  int headsCtr;
  int tailsCtr;
  double bias;


  /***
   *  Coin() -- default constuctor
   *  precond:If the object is created with no inputs
   *  postcond:Sets the objects upFace to heads
   ***/
  public Coin() {
      upFace = "heads";
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:sets name to the string inputted
  ***/
  public Coin( String s ) {
    if(s == "penny" || s == "nickel" || s == "dime" || s == "quarter" || s == "half dollar" || s == "dollar"){
        name = s;
        upFace = "heads";
    }
    else{
        System.out.println("not a valid input");
    }
  }


  /***
      Coin(String,String) --
      precond:input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      and
      "heads"
      "tails"
      postcond:sets name and upFace to the inputs
  ***/
  public Coin( String s, String nowFace ) {
    if(s == "penny" || s == "nickel" || s == "dime" || s == "quarter" || s == "half dollar" || s == "dollar"){
        name = s;
        //System.out.println(name);
    }
    else{
        System.out.println("Name can't be set");
    }
    if(nowFace == "heads" || nowFace == "tails"){
        upFace = nowFace;
        //System.out.println(upFace);
    }
    else{
        System.out.println("Face can't be set");
    }

  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
      return upFace;
  }

  public int getFlipCtr() {
      return flipCtr;
  }

  public double getValue() {
      return value;
  }

  public int getHeadsCtr() {
      return headsCtr;
  }

  public int getTailsCtr() {
      return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/

  private double assignValue( String s ) {
      if(s == "penny"){
          value = .01;
          return value;
      }else if( s == "nickel"){
          value = .05;
          return value;
      }else if( s == "dime"){
          value = .10;
          return value;
      }else if( s == "quarter"){
          value = .25;
          return value;
      }else if( s == "half dollar"){
          value = .50;
          return value;
      }else if( s == "dollar"){
          value = 1.00;
          return value;
      }else{
          System.out.println("Not a valid coin");
          return 0.00;
      }
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  /*
  public void reset( String s, double d ) {

  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/

  public String flip() {
      bias = Math.random();
      bias = Math.round(bias);
      flipCtr += 1;
      if(bias == 1.0){
          upFace = "heads";
          headsCtr += 1;
          return "heads";
      }
      else{
          upFace = "tails";
          tailsCtr += 1;
          return "tails";
      }
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/

  public boolean equals( Coin other ) {
      if(upFace == other.upFace){
          return true;
      }
      else{
          return false;
      }
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/

  public String toString() {
    return name + "--" + upFace;

  }

}//end class
