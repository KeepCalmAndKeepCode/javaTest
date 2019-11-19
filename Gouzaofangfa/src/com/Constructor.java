package com;

public class Constructor {
	// 给Constructor类定义了一个成员变量name
	private String name;

	// 无参构造方法，方法名必须跟类名一致，即首字母需要大写
	public Constructor() {
		System.out.println("调用无参数的构造方法。。");
	}

	// 带一个参数的构造方法
	public Constructor(String name) {
		// 通过this()调用无参构造方法
		this();
		this.name = name;
		// 构造方法里可以调用普通方法
		commonMethod();
	}

	public void commonMethod() {
		System.out.println("调用普通方法");
	}

	// 写个主函数测试一下
	public static void main(String[] args) {
		// 通过无参构造创建一个Constructor对象
		Constructor cons1 = new Constructor();
		cons1.name = "我是通过无参构造器创建的对象";
		System.out.println(cons1);

		System.out.println("=====================我是分隔线=====================");

		// 通过有参构造方法创建另一个对象
		Constructor cons2 = new Constructor("我是通过有参构造方法创建的对象");
		System.out.println(cons2);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[我的名字是：" + name + "]";
	}
}
