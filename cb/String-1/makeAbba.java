public class makeAbba{
	public String makeAbba(String a, String b) {
  		return a + b + b + a;
	}
	
	makeAbba("Hi", "Bye") //HiByeByeHi
	makeAbba("Yo", "Alice")// YoAliceAliceYo
	makeAbba("", "y") //yy
}
