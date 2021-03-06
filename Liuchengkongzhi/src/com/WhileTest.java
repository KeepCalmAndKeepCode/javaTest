package com;

public class WhileTest {

	public static void main(String[] args) {
		/*
		 * 当条件表达式的返回值为真时，则执行“{}”中的语句，当执行完“{}”中的语句后，
		 * 重新判断条件达式的返回值，直到表达式返回的结果为假时，退出循环。
		 */
		int x = 1;
		int sum = 0;
		while (x <= 10) {
			sum = sum + x;
			x++;
		}
		System.out.println(sum); // 55
		
		/*
		 * do...while 和  while 语句的区别在于
		 * do...while 会先依次循环爱判断条件是否成立
		 * */
		
		do {
			System.out.println("ok");
		} while(x == 10);
	}

}
