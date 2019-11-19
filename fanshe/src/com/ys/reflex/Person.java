package com.ys.reflex;

public class Person {
	/**
	 * Java反射
	 */
	 //私有属性
  private String name = "Tom";
  //公有属性
  public int age = 18;
  //构造方法
  public Person() {    
  }
  //私有方法
  private void say(){
      System.out.println("private say()...");
  }
  //公有方法
  public void work(){
      System.out.println("public work()...");
  }
  
  public static void main(String[] args) throws ClassNotFoundException {
		Person p1 = new Person();
		Class c1 = p1.getClass();
		System.out.println(c1);
		Class c2 = Person.class;
		System.out.println(c2);
		Class c3 = Class.forName("com.ys.reflex.Person");
		System.out.println(c3);
		Class clazz = Person.class;
		System.out.println(clazz);
	}
}
