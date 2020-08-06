package neibulei;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Outer {
	private String str = "外部类中的字符串";

	// 定义一个内部类
	class Inner {
		private String inStr = "内部类中的字符串";

		// 定义一个普通方法
		public void print() {
			// 调用外部类的str属性
			System.out.println(str);
		}
	}
}