package com.techlab.person;

public class Person {
	private int id;
	private float height,weight;
	private String name;
	
	public Person(int id, float weight, float height, String name) {
		this.id = id;
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	
	public void eat() {
		float tot_weight;
		tot_weight = (float) (weight * 0.05);
		weight += tot_weight;
	}
	
	public void play() {
		float tot_weight,tot_height;
		tot_weight = (float) (weight * 0.1);
		tot_height = (float) (height * 0.01);
		weight -= tot_weight;
		height += tot_height;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person(12,48,169,"Sid");
		Person p2 = new Person(17,65,172,"Charlie");
		p1.eat();
		p1.play();
		p1.eat();
		p2.play();
		p2.play();
		p2.eat();
		System.out.println("\nPerson 1 Details: ");
		createPerson(p1);
		System.out.println("\nPerson 2 Details: ");
		createPerson(p2);
	}
	
	public static void createPerson(Person obj) {
		System.out.println("ID: "+obj.id);
		System.out.println("Name: "+obj.name);
		System.out.println("Weight: "+obj.weight);
		System.out.println("Height: "+obj.height);
	}

}
