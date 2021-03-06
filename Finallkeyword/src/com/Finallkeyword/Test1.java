package com.Finallkeyword;

public class Test1 {
	/*
	 * final关键字
	 * 修饰引用、方法和类。
	 * 
	 * 用来修饰一个引用
	 * * 如果引用为基本数据类型，则该引用为常量，该值无法修改；
	 * * 如果引用为引用数据类型，比如对象、数组，则该对象、数组本身可以修改，如果是引用类型的变量，则在对其初始化之后便不能再让其指向另一个对象。
	 * * 如果引用是类的成员变量，则必须当场赋值，否则编译会报错。
	 * 
	 * 当使用final修饰方法时，这个方法将成为最终方法，无法被子类重写。但是，该方法仍然可以被继承。
	 * “使用final方法的原因有两个。第一个原因是把方法锁定，以防任何继承类修改它的含义；
	 * 第二个原因是效率。在早期的Java实现版本中，会将final方法转为内嵌调用。
	 * 但是如果方法过于庞大，可能看不到内嵌调用带来的任何性能提升。在最近的Java版本中，不需要使用final方法进行这些优化了。“
	 * 注：类的private方法会隐式地被指定为final方法。
	 * 
	 * 当用final修改类时，该类成为最终类，无法被继承。简称为“断子绝孙类”。
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
