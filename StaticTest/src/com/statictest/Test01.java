package com.statictest;

/**
 *
 */
public class Test01 {
  // 静态变量被所有的对象所共享，在内存中只有一个副本，它当且仅当在类初次加载时会被初始化
  // static成员变量的初始化顺序按照定义的顺序进行初始化。
  public static int staticnum = 1;
  int num = 2;

  /*
   * 静态方法没有this
   * 不能访问 非静态成员变量 和 非静态成员方法
   * 可以在没有创建任何对象的前提下，仅仅通过类本身来调用static方法。这实际上正是static方法的主要用途
   * */
  static void staticmethod01() {
    // num ++;
    staticnum++;
  }

  static void staticmethod02() {
    staticnum--;
  }

  public void methods() {
    // 非静态成员方法中是可以访问静态成员方法/变量的
    num++;
    staticnum++;
    staticmethod02();
  }


  /*
   * 非静态代码块，在创建对象的时候(即new一个对象的时候)执行，每次创建对象都会执行一次
   * */ {
    System.out.println("非静态代码块");
  }

  /*
   * static代码块
   * 静态代码块，在虚拟机加载类的时候就会加载执行，而且只执行一次;
   * 可以通过Class.forName("classPath")的方式唤醒代码的static代码块,但是也执行一次。
   * 执行顺序：（优先级从高到低。）静态代码块>mian方法>构造代码块>构造方法。
   * */
  static {
    System.out.println("静态代码块");
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Test01 obj = new Test01();
    obj.methods();
    System.out.println(obj.num);// 3
  }

}
