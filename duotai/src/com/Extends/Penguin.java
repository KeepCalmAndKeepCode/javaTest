package com.Extends;

public class Penguin extends Animal{

	public Penguin(String myName, int myid) {
		super(myName, myid);
	}
	
	public void eat() {
		System.out.println(name + "吃");
	}
	
	public void eatTest() {
		super.eat();
		this.eat();
	}
	
	public static void main(String[] args) {
		Penguin p1 = new Penguin("qwer",12);
		p1.eatTest();
	}

}
