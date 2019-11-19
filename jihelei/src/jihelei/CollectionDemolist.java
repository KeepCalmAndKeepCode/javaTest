package jihelei;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemolist {
	public static void main(String[] args) {
		String aString = "A", bString = "B", cString = "C", dString = "D", eString = "E";

		List<String> list = new LinkedList<>(); 	// 创建list集合对象
		list.add(aString); 												// 向集合中添加元素
		list.add(bString);
		list.add(eString);
		// 输出语句，用迭代器
		Iterator<String> iter = list.iterator(); 	// 创建集合迭代器
		while (iter.hasNext()) {								  // 遍历集合中的元素
			System.out.print(iter.next() + " ");
		}

		System.out.println(); // 换行
		list.set(1, cString); // 将索引位置1的对象修改为对象bString
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
