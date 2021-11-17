/***
 *Jacob Ng, Ari Gurovich, Kartik Vanjani
 * APCS
 * L00 -- Etterbay Odingcay Oughthray Ollaborationcay
 * 2021-11-09
 * time spent: 4 hrs
 *
 *
 *
 * class Pig
 * a Pig Latin translator
 ***/

 /**
 New in v4
 -Scanner that maybe works
 DISCO:
- Index can be used to locate a letter and insert any thing you want before or after the character you locate in the test case.
- For a sentence, you need to combine it for more than one word since you are trying to find the latin translation for multiple words.
QCC:
- If the length of the word is only one character, does java find the index of it and then just insert way after it, or ay if it is not a vowel?
- What are different test cases in which this code is subject to break?
- Do any series of capital letters or vowels break the pig latin translation in java?
- How do we separate words in a String?
- How do we move the punctuation?
- How does the < operation in the command line work?
- We could not implement the scanner, the punctuation rule or the multiple words in a sentence rule.
 HOW WE UTILIZED SCANNER DEMO (v4)
 -We didn't get to it
 WHAT CAUSES THE RUNTIME ERROR IN THE SCANNER DEMO
 - There are 2 println(sc.next()) so if there are an odd number of things to scan, the second sc.next() will keep looking forever.
 **/

import java.util.Scanner;
public class Pig {

  private static final String VOWELS = "aeiouy";
  private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String PUNCS = ".,:;!?";
  private static final String SPACE = " ";

  /**
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p") -> false
  **/
  public static boolean hasA( String w, String letter ) {

    return w.indexOf(letter) != -1;

    /* equiv code, wo using indexOf()...
       boolean ans = false;

       for( int i = 0; i < w.length(); i++ ) {

       if ( w.substring(i,i+1).equals(letter) ) {
       ans = true;
       //Q: is there a more efficient way?
       }
       }
       return ans;
    */
  }//end hasA()


  /**
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    **/
  public static boolean isAVowel( String letter ) {
    return VOWELS.indexOf( letter ) != -1;
  }


  /**
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    **/
  public static int countVowels( String w ) {

    return allVowels(w).length();

    /* long version using for
       int numVowels = 0; //init vowels counter var
       //must touch each letter in word, so use FOR
       for( int i = 0; i < w.length(); i++ ) {

       if ( isAVowel( w.substring(i,i+1) ) )
       numVowels++;
       }
       return numVowels;
    */
  }


  /**
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz") -> false
    **/
  public static boolean hasAVowel( String w ) {
    {
    for ( int i = 0 ; i < w.length() ; i++ ) {
      if (isAVowel(w.charAt(i) + "")) {
        return true;
      }
    }
    return false;
  }
  }


  /**
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    **/
  public static String allVowels( String w ) {

    String ans = ""; //init return String

    for( int i = 0; i < w.length(); i++ ) {

      if ( isAVowel( w.substring(i,i+1) ) )
        ans += w.substring( i, i+1 ); //grow the return String
    }
    return ans;
  }


  /**
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
    **/
  public static String firstVowel( String w ) {

    String ans = "";

    if ( hasAVowel(w) ) //Q: Why this necess?
      ans = allVowels(w).substring(0,1);

    return ans;
  }


  /**
    boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
    **/
  public static boolean beginsWithVowel( String w ) {
    return isAVowel( w.substring(0,1) );
  }


  /*=====================================
      boolean isPunc(String) -- tells whether a character is punctuation
      pre:  symbol.length() == 1
      post: isPunc(".") -> true
            isPunc("b") -> false
      =====================================*/


    public static boolean isPunc( String symbol){
      return hasA(PUNCS, symbol);
    }


    /*=====================================
      boolean isUpperCase(String) -- tells whether a letter is uppercase
      pre:  letter.length() == 1
      post: isUpperCase("a") -> false
            isUpperCase("A") -> true
      =====================================*/


    public static boolean isUpperCase( String letter ) {
        return CAPS.indexOf( letter ) != -1;
    }


    /*=====================================
      boolean hasPunc(String) -- tells whether a String contains punctuation
      pre:  w != null
      post: hasPunc("cat.") -> true
            hasPunc("cat") -> false
      =====================================*/


    public static boolean hasPunc( String w ) {
      {
      for ( int i = 0 ; i < w.length() ; i++ ) {
        if (isPunc(w.charAt(i) + "")) {
          return true;
        }
      }
      return false;
      }
    }


    /*=====================================
      boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
      pre:  w != null and w.length() > 0
      post: beginsWithUpper("Apple") -> true
            beginsWithUpper("apple") -> false
      =====================================*/


    public static boolean beginsWithUpper( String w ) {

	    return isUpperCase(w.substring(0,1) );
    }



    /*=====================================
      boolean isSpace(String) -- tells whether a character is a SPACE
      pre:  symbol.length() == 1
      post: isSpace(" ") -> true
            isSpace("b") -> false
      =====================================*/
    public static boolean isSpace( String symbol ) {

	    return hasA(SPACE, symbol);
    }

    public static boolean hasSpace( String w ) {
      {
      for ( int i = 0 ; i < w.length() ; i++ ) {
        if (isSpace(w.charAt(i) + "")) {
          return true;
        }
      }
      return false;
      }
    }

    public static int spaceCounter( String w ) {

      int counter = 0;

      for( int i = 0; i < w.length(); i++ ) {

        if ( isSpace( w.substring(i,i+1) ) )
          counter++; //grow the return String
      }
      return counter;
    }

    /**
      String engToPig(String) -- converts an English word to Pig Latin
      pre:  w.length() > 0
      post: engToPig("apple")  --> "appleway"
      engToPig("strong") --> "ongstray"
      engToPig("java")   --> "avajay"
      **/
    public static String engToPig( String w ) {
/**
      String ans = "";

      if (hasSpace(w)){
          //code that translates each word of the sentence
          //How do we separate words in a string.
      }
      else{
          ans = pigWord(w);
      }
      return ans;
**/
/**
      String ans = "";
      String currentWord = "";
      int i, j, wordNum, count;
      j = 0;

      if(hasSpace(w)){
        wordNum = spaceCounter(w) + 1;
        for(count = 0; count < wordNum; count++){
            for(i = j; !isSpace(w.substring(i,i+1)) && (i < w.length()); i++){
              currentWord += w.substring(i,i+1);
            }
            ans += pigWord(currentWord);
            currentWord = "";
            j = i+1;
        }
      }else{
          ans = pigWord(w);
      }
      return ans;
    **/
    }

      public static String pigWord( String w ) {

        String ans = "";

        if (beginsWithUpper(w)){
            w = w.toLowerCase();
            if ( beginsWithVowel(w) ){

              ans = w.substring(0,1).toUpperCase() + w.substring(1) + "way";
            }
            else {
              int vPos = w.indexOf( firstVowel(w) );
              ans = w.substring(vPos, vPos + 1).toUpperCase() + w.substring(vPos + 1) + w.substring(0,vPos) + "ay";
            }
        }else{

            if ( beginsWithVowel(w) ){
              ans = w + "way";
            }

            else {
              int vPos = w.indexOf( firstVowel(w) );
              ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
            }
        }
        return ans;
      }

/**
  public static void main( String[] args ) {

    //for( String word : args )
    //  System.out.println( "allVowels \t" + allVowels(word) );
    //  System.out.println( "firstVowels \t" + firstVowel(word) );
    //  System.out.println( "countVowels \t" + countVowels(word) );
      //System.out.println( "engToPig \t" + engToPig("Hi") );
      //System.out.println( "engToPig \t" + engToPig("Hi Im Bob") );
      //System.out.println( hasSpace("hi "));
    //  System.out.println( "engToPig \t" + engToPig("Bananas are fun") );
    //  System.out.println( "engToPig \t" + engToPig("I am sad") );
    //  System.out.println( "---------------------" );
    }
**/
  public static void main( String[] args ) {

    //instantiate a Scanner with STDIN as its bytestream
    Scanner sc = new Scanner( System.in );

    while( sc.hasNext() ) {
      System.out.println( engToPig(sc.next()) );
      //System.out.println( sc.next() );
    }

  }//end main()
  }//end main()

//}//end class Pig
