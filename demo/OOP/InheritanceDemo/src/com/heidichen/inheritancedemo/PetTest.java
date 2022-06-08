package com.heidichen.inheritancedemo;

public class PetTest {

	public static void main(String[] args) {
		Pet pet1 = new Pet();
		
		Bird bird1 = new Bird("Stitch");
		
		pet1.printStatus();
		bird1.printStatus();

		
		Dog dog1 = new Dog();
		dog1.bark().bark().bark();
		

	}

}
