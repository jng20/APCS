/*
Nacho Patcho Returns (Gabriel Thompson and Iggy, Faiza Huda and Truthful Tom, Jacob Ng and PreGuac)
APCS
HW26 -- GCD Three Ways
2021-10-26
*/

/*
DISCO:
- must return stuff
QCC:
-Exception in thread "main" java.lang.ArithmeticException: / by zero

ALGO:
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
