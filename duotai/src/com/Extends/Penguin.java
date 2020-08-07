package com.Extends;
/*
 * 继承就是子类继承父类的特征和行为，使得子类对象（实例）具有父类的实例域和方法，或子类从父类继承方法，使得子类具有父类相同的行为。
 * 子类拥有父类非 private 的属性、方法。
 * 子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
 * 子类可以用自己的方式实现父类的方法。
 * Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，
 * 多重继承就是，例如 A 类继承 B 类，B 类继承 C 类，所以按照关系就是 C 类是 B 类的父类，B 类是 A 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。
 * 提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。
 * 
 * */
public class Penguin extends Animal{

	public Penguin(String myName, int myid) {
		/*
		 * super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。
		 * */
		super(myName, myid);
		System.out.println(super.name);
	}
	
	/*
	 * 重载、重构(overload)
	 * 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
	 * 每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
	 * */
	public Penguin(int id) {
		System.out.println(id);
	}
	
	/*
	 * 重写(override)
	 * ​是子类对父类的允许访问的方法的实现过程进行重新编写, 
	 * 返回值和形参都不能改变。即外壳不变，核心重写！
	 * * 返回类型与被重写方法的返回类型可以不相同，但是必须是父类返回值的派生类。
	 * * 父类的成员方法只能被它的子类重写。
	 * * 声明为 final 的方法不能被重写。
	 * */
	public void eat() {
		System.out.println(name + "子类吃");
	}
	
	public void eatTest() {
		// super.eat();
		this.eat();
	}
	
	
	public static void main(String[] args) {
		Penguin p1 = new Penguin("qwer",12);
		p1.eatTest();
		p1.introduction();
		Penguin p2 = new Penguin(12);
//		system.out.println(p1.myid);
	}

}
