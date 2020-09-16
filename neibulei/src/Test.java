public class Test {
  /**
   * 一个类定义在另一个类里面或者一个方法里面，这样的类称为内部类.
   * 一个类内部进行其他类结构的嵌套操作
   * 内部类一般来说包括这四种：成员内部类、局部内部类、匿名内部类和静态内部类。
   *
   * 内部类一般只为其外部类使用；
   * 内部类与外部类可以方便的访问彼此的私有域（包括私有方法、私有属性）。
   * 内部类是另外一种封装，对外部的其他类隐藏。
   * 每个内部类都能独立地继承一个接口，而无论外部类是否已经继承了某个接口。内部类可以实现java的单继承局限。
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //创建外部类对象
    Outer out = new Outer();
    //外部类方法
    out.fun();  // 外部类中的字符串

    /**
     * 在外部类外部 创建非静态内部类对象
     * 外部类.内部类 内部类对象 = new 外部类().new 内部类();
     * */
    Outer.Inner in1 = new Outer().new Inner();
    in1.print(); // 内部类的字符串
  }
}

class Outer {
  private String str = "外部类中的字符串";

  //**************************
  //定义一个内部类
  class Inner {
    private String inStr = "内部类中的字符串";

    //定义一个普通方法
    public void print() {
      //调用外部类的str属性
      System.out.println(str);
      System.out.println(inStr);
    }
  }
  // 静态内部类

  //**************************
  //在外部类中定义一个方法，该方法负责产生内部类对象并调用print()方法
  public void fun() {
    //内部类对象
    Inner in = new Inner();
    //内部类对象提供的print
    in.print();

  }
}





