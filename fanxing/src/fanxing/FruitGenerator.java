package fanxing;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * 即：class FruitGenerator<T> implements Generator<T>{
 * 如果不声明泛型，如：class FruitGenerator implements Generator<T>，编译器会报错："Unknown class"
 */
// 子类不明确泛型类的类型参数变量，实现类也要定义出<T>类型的
public class FruitGenerator<T> implements Generator<T>{
  @Override
  public void show(T t) {
    System.out.println(t);
  }
  @Override
  public T next() {
    return null;
  }

  /**
   * 此处’？’是类型实参，而不是类型形参
   * 可以解决当具体类型不确定的时候，这个通配符就是 ?  ；当操作类型时，不需要使用类型的具体功能时，只使用Object类中的功能。那么可以用 ? 通配符来表未知类型。
   *
  */
  public void showKeyValue1(Generic<?> obj){
    System.out.println(obj.getKey());
  }
  /**
   * 泛型方法的基本介绍
   * @param tClass 传入的泛型实参
   * @return T 返回值为T类型
   * 说明：
   *     1）public 与 返回值中间<T>非常重要，可以理解为声明此方法为泛型方法。
   *     2）只有声明了<T>的方法才是泛型方法，泛型类中的使用了泛型的成员方法并不是泛型方法。
   *     3）<T>表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型T。
   *     4）与泛型类的定义一样，此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型。
   */
  public <T> T genericMethod(Class<T> tClass) throws InstantiationException , IllegalAccessException{
    T instance = tClass.newInstance();
    return instance;
  }

  // 在此处使用通配符，则可以传入各种类型的 List 泛型，
  public static void getData(List<?> data) {
    System.out.println("Test date :" + data.get(0));
  }
  public static void main(String[] args) {
    List<String> name = new ArrayList<String>();
    List<Integer> age = new ArrayList<Integer>();
    List<Number> number = new ArrayList<Number>();
    name.add("icon");
    age.add(18);
    number.add(314);
    getData(name);
    getData(age);
    getData(number);
  }
}


