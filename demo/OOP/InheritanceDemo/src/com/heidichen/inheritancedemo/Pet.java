package com.heidichen.inheritancedemo;

public class Pet {
	// attributes - what it has (properties)
	// name, age, mood
	protected String name;
	private Integer age;
	protected Integer mood;

	// constructors
	public Pet() {
		this.name = "A Random Pet";
		this.age = 0;
		this.mood = 1;
	}

	public Pet(String name) {
		this.name = name;
		this.age= 0;
		this.mood = 5;
	}

	public Pet(String name, Integer age) {
		this.name = name;
		this.age = age;
		this.mood = 7;
	}

	public Pet(String name, Integer age, Integer mood) {
		this.name = name;
		this.age = age;
		this.mood = mood;
	}

	
	// other methods
	public void printStatus() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Mood: " + this.mood);
	}
	
	

	// getter/setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getMood() {
		return mood;
	}

	public void setMood(Integer mood) {
		this.mood = mood;
	}
	
	

	
	
	
	
}
