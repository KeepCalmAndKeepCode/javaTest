package com.innerClass;

public class OuterClass {
	innerClass in = new innerClass();
	public void outf() {
		in.inf();
	}
	
	class innerClass{
		innerClass(){};
		public void inf() {};
		int y = 0;
	}
	public innerClass doit() {
		in.y = 4;
		return new innerClass();
	}
	
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		// �ڲ���Ķ���ʵ���������������ⲿ����ⲿ��ķǾ�̬������ʵ��
		OuterClass.innerClass in = out.doit();
		OuterClass.innerClass in2 =out.new innerClass();
	}

}
