package icehs.science.chapter08;

public class Account {
	
	private String number;
	private int balance;
	private double interestRate;
	
	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public double getInterestRate() {
		return interestRate;
	}



	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}



	public String getNumber() {
		return number;
	}
	
	public void calculateInterest() {
		int interest = (int)(balance * interestRate / 100);
		balance += interest;
	}



	public Account(String number, int balance, double interestRate) {
		this.number = number;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	

}
