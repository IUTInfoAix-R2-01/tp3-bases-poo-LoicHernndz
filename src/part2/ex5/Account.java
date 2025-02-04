package part2.ex5;

public class Account {
	private int id;
	private Customer customer;
	private double balance;
	
	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
		this.balance = 0.0;
	}
	
	public int getId() {
		return id;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}

	public String toString() {
		return getCustomerName() + "("+id+")" + " balance=$" + String.format("%.2f", balance);
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if (balance - amount > 0)	
			balance -= amount;
		else
			System.out.println("amount withdrawn exceeds the current balance !");
	}
}
