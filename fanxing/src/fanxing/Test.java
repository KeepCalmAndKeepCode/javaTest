package fanxing;

import sun.rmi.runtime.Log;
import java.util.ArrayList;
import java.util.List;

public class Test {
	/**
	 * 泛型，即“参数化类型（类型参数化）”。所操作的数据类型被指定为一个参数。
	 * 未知的数据类型，当我们不知道使用什么数据类型的时候可以使用泛型。
	 * 就是将类型由原来的具体的类型参数化，类似于方法中的变量参数，
	 * 此时类型也定义成参数形式（可以称之为类型形参），
	 * 然后在使用/调用时传入具体的类型（类型实参）。
	 * 
	 * 泛型的本质是为了参数化类型（在不创建新的类型的情况下，通过泛型指定的不同类型来控制形参具体限制的类型）。也就是说在泛型使用过程中，
	 * 操作的数据类型被指定为一个参数，这种参数类型可以用在类、接口和方法中，分别被称为泛型类、泛型接口、泛型方法。
	 * 泛型类型在逻辑上看以看成是多个不同的类型，实际上都是相同的基本类型。
	 *
	 * 一些常用的泛型类型变量：
	 * E：元素（Element），多用于java集合框架
	 * K：关键字（Key）
	 * N：数字（Number）
	 * T：类型（Type）
	 * V：值（Value）
	 *
	 * */
	// 泛型方法
	/*
	* 用户传递进来的是什么类型，返回值就是什么类型了
	* 仅仅在某一个方法上需要使用泛型....外界仅仅是关心该方法，不关心类其他的属性...这样的话，我们在整个类上定义泛型，未免就有些大题小作了。
	* */
	public <T> void show(T t) {
		System.out.println(t);
	}
	// 在此处使用通配符，则可以传入各种类型的 List 泛型，
	/*
	* 因为 List 是泛型类，为了 表示各种泛型 List 的父类，可以使用类型通配符，类型通配符使用问号(?)表示，
	* 将一个问号当做类型元素传递个 List，可以表示为 List<?>,意思是 元素类型未知的 List，不同于 List 其元素类型为 T。
	* 这个问号被称为通配符，它的元素类型可以匹配任何类型。
	* */
	public static void getData(List<?> data) {
		System.out.println("Test date :" + data.get(0));
	}

	public static void main(String[] args) {
		//泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
		//传入的实参类型需与泛型的类型参数类型相同，即为Integer.
		Generic<Integer> genericInteger = new Generic<Integer>(123456);
		Generic<String> genericInteger1 = new Generic<String>("qwerty");
		/*
		* 定义的泛型类，就一定要传入泛型类型实参么？
		* 并不是这样，在使用泛型的时候如果传入泛型实参，则会根据传入的泛型实参做相应的限制，此时泛型才会起到本应起到的限制作用。
		* 如果不传入泛型类型实参的话，在泛型类中使用泛型的方法或成员变量定义的类型可以为任何的类型。
		* */
		Generic generic = new Generic("111111");
		System.out.println(genericInteger.getKey());
		System.out.println(genericInteger1.getKey());

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
