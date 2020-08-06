package myannotation;

public class Hero {
	// 这个元素是用来标记过时的元素，想必大家在日常开发中经常碰到。
	// 编译器在编译阶段遇到这个注解时会发出提醒警告，告诉开发者正在调用一个过时的元素比如过时的方法、过时的类、过时的成员变量。
	@Deprecated
	public void say() {
		System.out.println("Noting has to say!");
	}

	public void speak() {
		System.out.println("I have a dream!");
	}
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.say();
		hero.speak();
	}
}
