package com.gamingroom;

public class Entity {
	long id;
	String name;
	
	//Private constructor
	private Entity() {
		
	}
	
	//Constructor with parameters
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//Getter for id
	public long getId() {
		return id;
	}
	
	//Getter for name
	public String getName() {
		return name;
	}
	
	//toString method
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}
}
