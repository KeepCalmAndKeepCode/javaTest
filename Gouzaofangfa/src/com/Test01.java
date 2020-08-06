package com;

public class Test01 {
	String name = "name";
	int num = 1;
	/*
	 * 构造方法
	 * new 创建对象时调用，只能与 new 运算符结合使用
	 * 构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样。
	 * 构造方法不要写返回值类型，连void都不写。
	 * 构造方法不能return一个具体的返回值。因为构造方法的返回值是隐式的，如果写了返回值，会被当成普通方法。
	 * 构造方法不能被 static、final、synchronized、abstract 和 native（类似于 abstract）修饰。
	 * * 构造方法用于初始化一个新对象，所以用 static 修饰没有意义。
	 * * 构造方法不能被子类继承，所以用 final 和 abstract 修饰没有意义。
	 * * 多个线程不会同时创建内存地址相同的同一个对象，所以用 synchronized 修饰没有必要。
	 * 如果没有编写任何构造方法，那么编译器将默认会赠送一个构造方法，没有参数、方法体什么事情都不会做。
	 * 一旦编写了至少一个构造方法，那么编译器将不再赠送。
	 * */
	// 默认的构造方法
	public Test01() {
		System.out.println("im Test01");
		
	}
	/*
	 * 在一个类中定义多个具有不同参数的同名方法，这就是方法的重载。
	 * 这两个构造方法的名称都与类名相同，在实例化该类时可以调用不同的构造方法进行初始化。
	 * */
	// 带参数的构造方法
	public Test01(int a) {
		// num = num + a;
		this.num = a;
		System.out.println(num);
	}
	public void method01() {
		System.out.println("method01");
	}
	public void method02() {
		method01();
		System.out.println("method02");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test01 obj = new Test01();
		System.out.println(obj.name);
		obj.method02();
		Test01 obj1 = new Test01(10);
		System.out.println(obj1);
	}

}
