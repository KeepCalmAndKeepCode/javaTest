package com.Extends;

public class Animal {
  String name;
  int id;
  public Animal() {
		
	}
	public Animal(String myName, int myid) {
		name = myName;
		id = myid;
		System.out.println("Animal:"+ myName + "," + "myid:" + myid);
	}

	public void eat() {
		System.out.println(name + "父类吃");
	}

	public void sleep() {
		System.out.println(name + "正在睡");
	}

	public void introduction() {
		System.out.println("大家好！我是" + id + "号" + name + ".");
	}
}