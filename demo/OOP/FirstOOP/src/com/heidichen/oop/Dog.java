package com.heidichen.oop;

public class Dog {
	// ----------- attributes ----------------
    private String name;
    private int age;
    private String hairColor;
    private static int numOfDogs = 0;

 // ----------- constructors ----------------
    public Dog() {
    	this.name="Pepper";
    	this.age=42;
    	this.hairColor = "gray";
    	addDog();
    	
    }
    
	public Dog(String name, int age, String hairColor) {
		this.name = name;
		this.age = age;
		this.hairColor = hairColor;
		addDog();
	}
	

	public Dog(int age, String hairColor) {
		this.name = "Vicky";
		this.age = age;
		this.hairColor = hairColor;
		addDog();
	}

	// ----------- other methods ----------------
	private static void addDog() {
		numOfDogs++;
	}
	
	public void bark() {
		System.out.println("Borf Borf");
	}
	
	// ----------- getters & setters ----------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public static int getNumOfDogs() {
		return numOfDogs;
	}

	public static void setNumOfDogs(int numOfDogs) {
		Dog.numOfDogs = numOfDogs;
	}	
    
	
    
	
}
