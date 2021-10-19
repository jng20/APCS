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
	}
}
