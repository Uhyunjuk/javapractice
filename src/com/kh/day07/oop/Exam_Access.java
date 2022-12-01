package com.kh.day07.oop;

class Sample{
	
	public int a;
//	private int b;
	int c;
}

public class Exam_Access {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10; // 접근가능
//		aClass.b = 10; // 접근불가능 is not, visible
		aClass.c = 10; // 접근가능
	}

}
