/**
Nacho Patcho (Gabriel Thompson, Faiza Huda, Jacob Ng)
APCS
HW18 -- CPA-One
2021-10-14 -> 2021-10-16
**/

/**

DISCO:
 - You can create an instance of a class inside of that same class
 - You can use printf() to print formatted strings. We had done this briefly in the summer homework, but
   had forgotten how to use it

QCC:
 - Should the ID and PIN number be stored as numbers, or as a String? A number is easier to manage when it
   comes to verifying that it is valid and within a range, but String preserves leading zeros in IDs
 - In the withdraw() and deposit() functions, should we print out or return the new balance?

Team Nacho Patcho’s Latest and Greatest Q2 Response:
 - Because even without explicitly creating a default constructor, Java is able to create instances of the
   class

Team Nacho Patcho’s Latest and Greatest Q3 Response:
 - You can try passing the class instance through System.out.println(), and see if it returns a String
   representation of the object, the same way that it would for ints, floats, Strings, etc.

**/

public class BankAccount {
	// initializes instance variables
	private String accHolderName;
	private String accPassword;
	private double balance;
	private int pin;
	private int accID;
	
	// default constructor, which sets blank values for all instance variables (if no params are given)
	public BankAccount() {
		accHolderName = "";
		accPassword = "";
		balance = 0.0;
		pin = 0;
		accID = 0;
	}
	
	// over-loaded constructor, for if params are given
	public BankAccount( int id, String name, String pwd, int pinNum ) {
		// checks to see if id is within valid range, or else yields error message
		if (0 <= id && id < 1000000000) {
			accID = id;
		} else {
			System.out.println("Error: ID (" + id + ") not a valid 9-digit number");
			return;
		}
		
		// checks to see if pin is within valid range, or else yields error message
		if (0 <= pinNum && pinNum < 10000) {
			pin = pinNum;
		} else {
			System.out.println("Error: PIN (" + pinNum + ") not a valid 4-digit number");
			return;
		}
		
		// sets all other parameters unconditionally
		accHolderName = name;
		accPassword = pwd;
		pin = pinNum;
	}
	
	// prints out values of all instance variables. we added extra whitespace so everything aligns.
	public void printInfo() {
		System.out.println("======================="); // divider to distinguish between other text
		System.out.println("Account holder name: " + accHolderName);
                System.out.println("Account password:    " + accPassword);
                System.out.printf("Account balance:     %.2f\n", balance);
                System.out.println("PIN number:          " + pin);
                System.out.println("Account ID:          " + accID);
		System.out.println("=======================");
	}
	
	// function to add a given amount of money to the balance
	public double deposit( double amount ) {
		balance += amount;
		return balance;
	}
	
	// function to remove a given amount of money from the balance
	public double withdraw( double amount ) {
		balance -= amount;
		return balance;
	}
	
	// TEST CASES
	public static void main( String[] args ) {
		// test with all valid arguments
                BankAccount myAcc = new BankAccount( 123456789, "Nachos", "password123", 1336 );
                myAcc.deposit(456);
                myAcc.withdraw(3);
                myAcc.printInfo(); // should return account details with balance = 453.00
		
		// test with valid pin, not valid id
		myAcc = new BankAccount( 1000000000, "Nachos", "password123", 1336 ); // should yield an error message about ID
		
		// test with valid id, not valid pin
		myAcc = new BankAccount( 123456789, "Nachos", "password123", 1336433 ); // should yield an error message about ID
        }
}