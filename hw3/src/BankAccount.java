import java.util.*;

public class BankAccount implements Comparable<BankAccount>{
	private double balance;
	private int accNum;
	
	public BankAccount(int accNum, double balance) {
		this.accNum = accNum;
		this.balance = balance;
	}
	
	public int compare (BankAccount other) {
		return (int) (this.balance - other.balance);
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccNum() {
		return accNum;
	}
	
	public int compareTo(BankAccount other) {
		return (int) (this.balance - other.balance);
	}
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		System.out.println("Before Sort: ");

		for (int i = 0; i < 10; i++) {
			double balance = Math.random() * 100;
			accounts.add(new BankAccount(i, balance));
			System.out.println("Account #" + accounts.get(i).getAccNum() + ": " + accounts.get(i).getBalance());
		}
		System.out.println("");
		
		for (int i = 0; i < accounts.size(); i++) {
			for (int j = i; j < accounts.size(); j++) {
				if (accounts.get(i).compareTo(accounts.get(j)) > 0) {
					BankAccount temp = accounts.get(i);
					accounts.set(i, accounts.get(j));
					accounts.set(j, temp);
				}
			}
		}
		
		System.out.println("After Sort: ");
		for (BankAccount acc : accounts) {
			System.out.println("Account #" + acc.getAccNum() + ": " + acc.getBalance());
		}
	}
}
