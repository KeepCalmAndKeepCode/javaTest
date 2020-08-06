package fanxing;
import java.util.*;

// 无边界的通配符的主要作用就是让泛型能够接受未知类型的数据. 
public class Tongpeifu {
	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("aa");
		l1.add("bb");
		l1.add("cc");
		printList(l1);
		List<Integer> l2 = new ArrayList<>();
		l2.add(11);
		l2.add(22);
		l2.add(33);
		printList(l2);
	}
}
