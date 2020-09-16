package fanxing;
/*
* 泛型接口与泛型类的定义及使用基本相同。泛型接口常被用在各种类的生产器中
* */
public interface Generator<T> {
  public abstract void show(T t);
  public T next();
}
