/*
Nacho Patcho Returns | Gabriel Thompson and Iggy, Faiza Huda and Truthful Tom, Jacob Ng and PreGuac
APCS
HW26 -- GCD Three Ways
2021-10-26
time spent: 0.7 hrs
*/

/*
DISCO:
 - In a recursive function, the funtion must return in order to recall itself
 - Iterative functions loop to repeat a part of the code while a recursive function calls itself again to repeat all of the code
QCC:
 - Exception in thread "main" java.lang.ArithmeticException: / by zero
 - Under what circumstances would one technique be more effecient than the other?
 - Are there any tasks which are impossible to do via while loops and are only possible with recursion?
ALGO:
 - Given two ints a and b, we check if a is greater than b and if so, we reevaluate using a=(a-b) and b=b,
 - and if b is greater than a, we do the same thing, vise-versa.
 - If both a and b are equal, we return a.
*/

public class Stats{

	public static int gcd( int a, int b ){
		int i = 1;
		int answer = 0;
		while (i <= a){
			if (a % i == 0 && b % i == 0)	{answer = i;}
			i++;
		}
		return answer;
	}


	public static int gcdER( int a, int b ){
		if (a > b) {
			a -= b;
			return gcdER (a, b);
		} else if (b > a) {
			b -= a;
			return gcdER (a, b);
		}
		return a;
	}

	public static int gcdEW( int a, int b ){
		while (a != b){
			if (a > b){
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}


	public static void main(String[] args){
		// Tests for brute-force gcd
		System.out.println(gcd(7,8));
		System.out.println(gcd(7,14));
		System.out.println(gcd(26,14));

		// Tests for recursive
		System.out.println(gcdER(7,8));
                System.out.println(gcdER(7,14));
                System.out.println(gcdER(26,14));

		// Tests for iterative
		System.out.println(gcdEW(7,8));
                System.out.println(gcdEW(7,14));
                System.out.println(gcdEW(26,14));
	}
}
