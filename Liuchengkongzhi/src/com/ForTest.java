package com;

public class ForTest {

	public static void main(String[] args) {
		/*
		 * 在执行for循环时，首先执行表达式1，完成某一变量的初始化工作；
		 * 下一步判断表达式2的值，若表达式2的值为true，则进入循环体；
		 * 在执行完循环体后紧接着计算表达式3，这部分通常是增加或减少循环控制变量的一个表达式。
		 * 这样一轮循环就结束了。第二轮循环从计算表达式2开始，若表达式2返回true，则继续循环，否则跳出整个for语句。
		 */
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
