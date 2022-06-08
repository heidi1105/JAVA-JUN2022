package com.heidichen.abstractdemo;

public class CreditCardPayment extends Payment {
	private String creditCardNum, expDate, owner;
	
//	public CreditCardPayment(double amount) {
//		super(amount);
//	}

	public CreditCardPayment(double amount, String creditCardNum, String expDate, String owner) {
		super(amount);
		this.creditCardNum = creditCardNum;
		this.expDate = expDate;
		this.owner = owner;
	}

	@Override
	public void printReceipt() {
		System.out.println("Payment Method: Credit Card");
		System.out.println("Credit Card number: "+ this.creditCardNum + " ExpDate: " + this.expDate + " Owner : " +this.owner );
		System.out.println("You've paid "+ this.amount);
	}
	
	
	
	public String getCreditCardNum() {
		return creditCardNum;
	}

	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	
	
	
}
