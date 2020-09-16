/**
 * 将类的各个组成部分封装为其他对象，这就是反射机制。
 * JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意方法和属性；
 * 这种动态获取信息以及动态调用对象方法的功能称为java语言的反射机制。
 *
 * Reflection（反射）是Java被视为动态语言的关键，反射机制允许程序在执行期借助于 Reflection API取得任何类的内部信息，并能直接操作任意对象的内部属性及方法。
 * Class c = Class forName("java.lang String")
 *
 * 加载完类之后,在堆内存的方法区中就产生了一个Cass类型的对象(一个类只有个Cass对象),
 * 这个对象就包含了完整的类的结构信息.我们可以通过这个对象看到类的结构。
 * 这个对象就像一面镜子,透过这个镜子看到类的结构,所以，我们形象的称之为:反射
 *
 * Java反射机制提供的功能
 * 在运行时判断任意一个对象所属的类
 * 在运行时构造任意一个类的对象
 * 在运行时判断任意一个类所具有的成员变量和方法
 * 在运行时获取泛型信息
 * 在运行时调用任意一个对象的成员变量和方法
 * 在运行时处理注解
 * 生成动态代理
 *
 * 优点可以实现动态创建对象和编译,体现出很大的灵活性
 * 缺点对性能有影响.使用反射基本上是一种解释操作,我们可以告诉JVM,我们希望做什么并且它满足我们的要求.这类操作总是慢于直接执行相同的操作.
 *
 * java.lang.Class:代表一个类
 * java.lang.reflect.Method:代表类的方法
 * java.lang.reflect.Field:代表类的成员变量
 * java.lang.reflect.Constructor:代表类的构造器
 *
 * */
public class Test {
  public static void main(String[] args) {
    // 第一种方式获取Class对象
    Student stu1 = new Student();             //这一new 产生一个Student对象，一个Class对象。
    Class stuClass = stu1.getClass();         //获取Class对象
    System.out.println(stuClass.getName());

    //第二种方式获取Class对象
    Class stuClass2 = Student.class;
    System.out.println(stuClass == stuClass2);//判断第一种方式获取的Class对象和第二种方式获取的是否是同一个

    //第三种方式获取Class对象
    try {
      Class stuClass3 = Class.forName("fanshe.Student");//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
      System.out.println(stuClass3 == stuClass2);//判断三种方式是否获取的是同一个Class对象
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
