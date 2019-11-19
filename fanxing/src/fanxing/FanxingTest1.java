package fanxing;

public class FanxingTest1 {
	/*
	 * 泛型，即“参数化类型”。 将类型由原来的具体的类型参数化，类似于方法中的变量参数，此时类型也定义成参数形式（可以称之为类型形参），
	 * 然后在使用/调用时传入具体的类型（类型实参）
	 */
	//泛型方法 printArray                         
	public static <E> void printArray(E[] inputArray) {
		// 输出数组元素
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 创建不同类型数组： Integer, Double 和 Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("整型数组元素为:");
		printArray(intArray); // 传递一个整型数组

		System.out.println("\n双精度型数组元素为:");
		printArray(doubleArray); // 传递一个双精度型数组

		System.out.println("\n字符型数组元素为:");
		printArray(charArray); // 传递一个字符型数组
	}

}