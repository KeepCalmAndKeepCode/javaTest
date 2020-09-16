package reflect;

public class Test02 {
  public static void main(String[] args) throws ClassNotFoundException {
    // 通过反射获取类的 class对象
    Class c1 = Class.forName("reflect.User");
    System.out.println(c1);

    // 一个类在内存中只有一个Class对象
    // 一个类被加载后,类的整个结构都会被封装在Class对象中
    //以上的方法返回值的类型是一个C|ass类,此类是Java反射的源头,实际上所谓反射从程序的运行结果来看也很好理解,即:可以通过对象反射求出类的名称
  }
}
//实体类：pojo， entity
class User{
  private String name;
  private int id;
  private int age;

  public User(){}

  public User(String name, int id, int age) {
    this.name = name;
    this.id = id;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", id=" + id +
        ", age=" + age +
        '}';
  }
}