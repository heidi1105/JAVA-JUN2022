package com.heidichen.abstractdemo;


public class PaymentTest {
	public static void main(String[] args) {
//		Payment laptop = new Payment(1500);
		
		CashPayment pho = new CashPayment(10);
		CashPayment coffee = new CashPayment(5);
		
		pho.printReceipt();
		coffee.printReceipt();
		
		CreditCardPayment macbookAir = new CreditCardPayment(1500, "1212121212121212", "08/25", "Heidi Chen");
		macbookAir.printReceipt();
		
		
	}
}
