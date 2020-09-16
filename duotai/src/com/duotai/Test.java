package com.duotai;

public class Test {
	
	protected int age;
	int num = 10;

	public Test() {
		age = 40;
	}

	void eat() {
		System.out.println("父类在吃饭");
	}
	void action(){
		System.out.println("父类的action方法");
	}
	void getNum(){
		System.out.println(num);
	}
}