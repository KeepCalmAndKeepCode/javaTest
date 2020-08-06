package com.statictest;

public class Test01 {
	public static int staticnum = 1;
	int num = 2;
	/*
	 * 静态方法没有this
	 * 不能访问非静态成员变量和非静态成员方法
	 * */
	static void staticmethod01(){
		// num ++;
		staticnum ++;
	}
	static void staticmethod02() {
		staticnum --;
	}
	public void methods() {
		// 非静态成员方法中是可以访问静态成员方法/变量的
		num++;
		staticnum++;
		staticmethod02();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test01 obj = new Test01();
		obj.methods();
		System.out.println(obj.num);// 2
	}

}
