package com.heidichen.abstractdemo;

public class CashPayment extends Payment {
	public CashPayment(double amount) {
		super(amount);
	}
	
	public void printReceipt() {
		System.out.println("Payment Method: Cash");
		System.out.println("You've paid "+ this.amount);
	}
	
	
	
	
}
