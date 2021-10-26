/*
Fish and Guac
Jacob Ng, Gloria Lee
APCS
HW24 -- Get It While You Can
2021-10-25
time spent: 1 hr
*/

/*
DISCO
-you 2 loops instead of one because the conditional matchCtr < 65536 && matchCtr%2004 != 0 is unreachable
-We have to create new objects inside of the methods and not in the main method or outside of all methods
because if we don't, we get the error that the symbol cannot be found. This is the same for each counter
variable.
- We still spent too long on this hw.
- We chose not to use this(). It didn't check if the inputted string was a valid input.
QCC
-We changed headsCtr to numberHeads because we didn't want to get confused with the variable specific to
the coin object and the other variable inside the methods. Was this necessary?
- How could we have used this() in our code?
Post-v0 Mods

*/
public class Driver{

  public static void firstWhile(int x){
    Coin c1 = new Coin("penny","heads");
    Coin c2 = new Coin("penny", "heads");
    int numberHeads =0;
    while(numberHeads<x){
      c1.flip();
      c2.flip();
      if (c1.upFace=="heads"&&c2.upFace=="heads"){
        numberHeads+=2;
      }
      else if(c1.upFace=="heads"||c2.upFace=="heads"){
        numberHeads+=1;
      }
    }
    System.out.println(numberHeads);
  }
  public static void secondWhile(int y){
    Coin c1 = new Coin("penny","heads");
    Coin c2 = new Coin("penny", "heads");
    int matchCtr=0;
    while(matchCtr<y){
      c1.flip();
      c2.flip();
      if(c1.equals(c2)){
        matchCtr+=1;
      }
    }
    System.out.println(matchCtr);
  }

  public static void thirdWhile(int a, int b){
    Coin c1 = new Coin("penny","heads");
    Coin c2 = new Coin("penny", "heads");
    int matchCtr=0;
    while(matchCtr<a){
      c1.flip();
      c2.flip();
      if(c1.equals(c2)){
        matchCtr+=1;
      }
    }
    while(matchCtr%b!=0){
      c1.flip();
      c2.flip();
      if(c1.equals(c2)){
        matchCtr+=1;
      }
    }
    System.out.println(matchCtr);
}
  public static void main(String[]args){


    firstWhile(123);
    secondWhile(67);
    thirdWhile(65536,2004);

  }
}
