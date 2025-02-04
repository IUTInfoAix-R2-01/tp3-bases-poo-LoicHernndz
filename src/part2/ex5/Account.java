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
	
	public String toString() {
		return customer.getName() + "("+id+")" + " balance=$" + String.format("%.2f", balance);
	}
	
}
