package neibulei;

public class HelloWorldAnonymousClasses {

	/**
	 * 包含两个方法的HelloWorld接口
	 */
	interface HelloWorld {
		public void greet();

		public void greetSomeone(String someone);
	}

	public void sayHello() {

		// 1、局部类EnglishGreeting实现了HelloWorld接口
		class EnglishGreeting implements HelloWorld {
			String name = "world";

			public void greet() {
				greetSomeone("world");
			}
			
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}
		}

		HelloWorld englishGreeting = new EnglishGreeting();

		// 2、匿名类实现HelloWorld接口
		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";
			@Override
			public void greet() {
				greetSomeone("tout le monde");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		};

		// 3、匿名类实现HelloWorld接口
		HelloWorld spanishGreeting = new HelloWorld() {
			String name = "mundo";

			public void greet() {
				greetSomeone("mundo");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola, " + name);
			}
		};

		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();
	}
	
	// ... 可变长参数，就是这个位置可以传入任意个该类型参数,简单来说就是个数组。
	public static void main(String... args) {
		HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
		myApp.sayHello();
	}
}