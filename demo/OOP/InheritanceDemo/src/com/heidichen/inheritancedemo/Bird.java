package com.heidichen.inheritancedemo;

public class Bird extends Pet{
	// attributes
	private String featherColor;
	
	// constructors
	public Bird() {
		// super - calling the constructor of superclass/parent class
		// new Bird() --> creating a random bird
		super("A Random Bird");
		this.mood = 3;
		this.featherColor = "gray";
	}
	
	public Bird(String name) {
		super(name);
		this.featherColor = "purple";
	}

	// getter/setter	
	public String getFeatherColor() {
		return featherColor;
	}

	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}
	
	@Override
	public void printStatus() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.getAge());
		System.out.println("Mood: " + this.mood);
		System.out.println("Feather color:" + this.featherColor);
	}

	
}
