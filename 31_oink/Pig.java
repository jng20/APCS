/***
 * Nacho Patcho (Gabriel Thompson + Iggy, Faiza Huda + Truthful Tom, Jacob Ng + PreGuac)
 * APCS
 * HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
 * 2021-11-03w
 * time spent: 0.7hrs
 *
 * class Pig
 * a Pig Latin translator
***/

/***
 * DISCO:
 * - To convert from char to String, you can just add an empty String to the character
 * - Giving data the property "final" makes it invariable
 * - A bit obvious, but you can invoke methods from other methods
 *
 * QCC:
 * - Why should you make data "final"? Does this make the program run more efficiently?
 * - Should 'y' be considered a vowel? Y or y not?
 * - Why can't Java compare a String to a char? Why must you convert first?
***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  //A: It can be referenced by the whole class and can be changed just by changing the value.
  private static final String VOWELS = "aeiou";

  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) 
  {
    for ( int i = 0 ; i < w.length() ; i++ ) {
      if ((w.charAt(i) + "").equals(letter)) {
        return true;
      }
    }
    return false;
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) 
  {
    return hasA(VOWELS, letter);
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
  {
    int count = 0;
    for ( int i = 0 ; i < w.length() ; i++ ) {
      if (isAVowel(w.charAt(i) + "")) {
        count++;
      }
    }
    return count;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) 
  {
    for ( int i = 0 ; i < w.length() ; i++ ) {
      if (isAVowel(w.charAt(i) + "")) {
        return true;
      }
    }
    return false;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w ) 
  {
    String onlyVowels = "";
    
    for ( int i = 0 ; i < w.length() ; i++ ) {
      char c = w.charAt(i);
      if (isAVowel(c + "")) {
        onlyVowels += c;
      }
    }
    return onlyVowels;
  }

  public static void main( String[] args ) 
  {
    // test cases
    System.out.println(" === TEST CASES === ");
    System.out.println(hasA("nacho", "h") + " ... should be true");
    System.out.println(hasA("nacho", "x") + " ... should be false");
    System.out.println(isAVowel("x") + " ... should be false");
    System.out.println(isAVowel("e") + " ... should be true");
    System.out.println(isAVowel("🙂") + " ... should be false");
    System.out.println(countVowels("epizootiologies") + " ... should be 9");
    System.out.println(countVowels("srpska") + " ... should be 1");
    System.out.println(countVowels("Szymankowszczyzna") + " ... should be 3");
    System.out.println(hasAVowel("Rhythms") + " ... should be false");
    System.out.println(hasAVowel("Stuyvesant") + " ... should be true");
    System.out.println(allVowels("pneumonoultramicroscopicsilicovolcanoconiosis") + " ... should be \"euoouaiooiiiooaooioi\"");
    System.out.println(allVowels("strengths") + " ... should be \"e\"");
    System.out.println(allVowels("Twyndyllyngs") + " ... should be \"\"");
  }//end main()

}//end class Pig
