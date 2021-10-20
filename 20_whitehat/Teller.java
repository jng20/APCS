/*
Nacho Patcho (Gabriel Thompson and Iggy, Faiza Huda and Truthful Tom, Jacob Ng and PreGuac)
APCS
HW20 -- External Audit
2021-10-19
*/

/*
DISCO:
 - The input for a balance must be a double. There was an error when we put an integer.
QCC:
 - When we run System.out.println(test); it produced the same output as System.out.println(test.toString()); y tho?
 - What operations are possible from BankAccount’s main() method but not Teller’s?
 - We think there are no operations exclusive to BankAccount's main() because there are no private static methods in the BankAccount class.
*/

public class Teller{
	public static void main( String[] args){
		BankAccount test = new BankAccount();
		test.setName("ma");
       		test.setPasswd("password");
        	test.setPin((short) 12345);
        	test.setAcctNum(1234567890);
        	test.setBalance(500);
        	test.deposit(200);
        	test.withdraw(800);
		System.out.println(test.toString());
        	test.authenticate("not ma", "not password");

		BankAccount test2 = new BankAccount();
		test2.setName("Natcho Patcho");
		test2.setPasswd("HowdyDoody123");
		test2.setPin((short)-1000);
		test2.setAcctNum(-987654321);
		test2.setBalance(10000.00);
		test2.deposit(-1.1200001);
		System.out.println(test2.toString());
		test2.withdraw(-1.1200001);
		System.out.println(test2.toString());
		test2.authenticate("Natcho Patcho", "HowdyDoody123");
	}
}
