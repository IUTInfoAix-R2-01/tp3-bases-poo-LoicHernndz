package part2.ex5;

public class TestAccount {
	public static void main(String[] args) {
	Customer customer = new Customer(1234, "Client", 'm');
	Account account = new Account(1, customer, 1000000.00);
	
	System.out.println(account);
	
	account.setBalance(0.989);
	System.out.println(account);
	}
}
