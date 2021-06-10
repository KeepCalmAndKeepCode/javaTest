package fanxing;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(111);
    list.add("aaa");
    // System.out.println(list);
    Test2 test2 = new Test2();
    System.out.println(test2.name);
  }
}
