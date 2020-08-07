package com.duotai;
/*
 * 对象在不同情况下的不同表现 多态可以用“三个定义和两个方法”来总结 父类定义子类构建、 接口定义实现类构建、 抽象类定义实体类构建
 * 两个方法分别是方法重载和方法重写。 
 * 
 * Java多态的三个必要条件：
 * 1、 继承
 * 2、 子类重写父类方法
 * 3、 父类引用指向子类对象
 * 
 */
class TestChild extends Test { // 继承
	protected int age;

	public TestChild() {
		age = 18;
	}
	
	// 重写
	void eat() {
		System.out.println("孩子在吃饭");
	}

	void play() {
		System.out.println("孩子在打CS");
	}
	public static void main(String[] args) {
		/**
		 * 
		 * 
		 * */
		// 父类引用指向子类对象
		Test c = new TestChild();
    c.eat();
    c.action();
    // c.play();
    System.out.println("年龄："+ c.age );
	}
}