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
	int num = 20;
	public TestChild() {
		age = 18;
	}
	
	// 重写
	@Override
	void eat() {
		System.out.println("孩子在吃饭");
	}

	void play() {
		System.out.println("孩子在打CS");
	}

	@Override
	void getNum(){
		System.out.println(num);
	}
	public static void main(String[] args) {
		/**
		 * 
		 * 
		 * */
		// 父类引用指向子类对象
		Test c = new TestChild();
    c.eat(); // 孩子在吃饭
    c.action(); // 父类的action方法
    // c.play();

		/**
		 * 访问成员变量的两种方式：
		 * 直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
		 * 间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。
		 * */
		System.out.println(c.num); // 10
		c.getNum(); // 20

    System.out.println("年龄："+ c.age );// 年龄：40
	}
}