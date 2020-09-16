package fanxing;

/*
 * 泛型类
 * Java库中 E表示集合的元素类型，K 和 V分别表示表的关键字与值的类型
 * T（需要时还可以用临近的字母 U 和 S）表示“任意类型”
 *
 * 泛型类（generic class）就是具有一个或多个类型变量的类。
 */
// 类型变量T
public class Pair<T> {
  private T name;
  private T price;

  public Pair() {
  }

  public Pair(T name, T price) {
    this.name = name;
    this.price = price;
  }

  public T getName() {
    return name;
  }

  public void setName(T name) {
    this.name = name;
  }

  public T getPrice() {
    return price;
  }

  public void setPrice(T price) {
    this.price = price;
  }
}
