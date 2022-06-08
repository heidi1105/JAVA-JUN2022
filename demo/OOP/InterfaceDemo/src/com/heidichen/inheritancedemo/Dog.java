package com.heidichen.inheritancedemo;

public class Dog extends Pet implements Keepable{
	
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


	@Override
	public void showAffection() {
		System.out.println(this.name + " is cuddling with you. ");
	}


	@Override
	public void begForFood() {
		System.out.println(this.name + " is showing puppy eyes. PLEASE GIVE HIM FOOD.");
		
	}
	
}
