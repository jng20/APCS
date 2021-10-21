/*
Nacho Patcho (Gabriel Thompson and Iggy, Faiza Huda and Truthful Tom, Jacob Ng and PreGuac)
APCS
HW21 -- STAtisTically Speaking...
2021-10-20
*/

/*
DISCO:
-We discovered we could make a method for converting doubles to ints
-We discovered in the max functions that else{} isn't needed
QCC:
-Why was casting banned?
-How are we supposed to convert doubles to int without casting?
-For max with 3 inputs we can call our max function with 2 inputs.
*/

public class Stats {

  public static int round_int(double a) {
      int i = 0;
      while (i < a) {
              i++;
      }
      if (Math.abs(i - a) < Math.abs((i - 1) - a)) {
              return i;
      }
      return i - 1;
  }

  public static int mean(int a, int b) {
    	return (a + b) / 2;
  }

  public static double mean(double a, double b) {
        return (a + b) / 2;
  }

  public static int max(int a, int b) {
	if(a > b){
		return a;
	}
	return b;
  }

  public static double max(double a, double b) {
	if(a > b){
		return a;
	}
	return b;
  }

  public static int geoMean(int a, int b) {
	return round_int( Math.pow((a * b), 0.5));
  }

  public static double geoMean(double a, double b) {
	return Math.pow((a * b), 0.5);
  }

  public static int max(int a, int b, int c) {
	return max(a, max(b, c));
  }

  public static double max(double a, double b, double c) {
	return max(a, max(b, c));
  }

  public static int geoMean(int a, int b, int c) {
	return round_int(Math.pow(a * b * c, 1/3));
  }

  public static double geoMean(double a, double b, double c) {
	return Math.pow(a * b * c, 1/3);
  }


  //main method for testing functionality
  public static void main( String[] args ) {

  }

}//end class
