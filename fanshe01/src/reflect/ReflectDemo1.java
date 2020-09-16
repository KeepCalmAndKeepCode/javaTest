package reflect;


import domain.Person;

public class ReflectDemo1 {
  /**
   * 获取C1ass对象的方式：
   * 1.C1ass.forname("全类名"):将字节码文件加载进内存，返回Class对象
   * * 多用于配置文件，将类名定义在配置文件中。读取文件，加载类
   * 2.类名.class：通过类名的属性class获取
   * * 多用于参数的传递
   * 3.对象.get Class(): getclass()方法在 object类中定义着。
   * * 多用于对象的获取字节码的方式
   * 同一个字节码文件（*,c1ass）在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的C1ass对象都是同一个
   *
   * Class
   * */
  public static void main(String[] args) throws Exception {
    //1.C1ass.forname("全类名")
    Class cls1 = Class.forName("domain.Person");
    System.out.println(cls1);
    //2.类名.class
    Class cls2 = Person.class;
    System.out.println(cls2);
    //3.对象.getClass();
    Person p = new Person();
    Class cls3 = p.getClass();
    System.out.println(cls3);

    System.out.println(cls1 == cls2); // true
    System.out.println(cls1 == cls3); // true


  }
}
