package baozhuanglei;

public class IntegerTest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 500;
		Integer obj = new Integer(m); // 手动装箱
		int n = obj.intValue(); // 手动拆箱
		System.out.println("n = " + n);
		Integer obj1 = new Integer(500);
		System.out.println("obj 等价于 obj1？" + obj.equals(obj1));
	}

}
