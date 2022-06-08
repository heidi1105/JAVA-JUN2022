package com.heidichen.inheritancedemo;

public class Dog extends Pet {
	
	public Dog() {
		super();
		this.name = "A Random Dog";
	}
	
	
	public Dog bark() {
		System.out.println("Borf Borf");
		// mood is protected. Allow direct access
		this.mood++;
		System.out.println(this.name + " is happier now. Mood: "+ this.mood);
		return this;
	}
	
	// age is private variable, can only use getter/setter
	public void birthday() {
		this.setAge(this.getAge()+1);
	}
	
}
