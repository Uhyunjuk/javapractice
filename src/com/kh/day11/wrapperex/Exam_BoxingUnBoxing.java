package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {

	public static void main(String[] args) {
		Integer num = Integer.valueOf(0);
		// Boxing(�ڵ� �ڽ�)
		Integer su = 10;
		
		int soo = num.intValue(); // num ��ü�� �⺻������ �ٷ��
		// UnBoxing(�ڵ� ��ڽ�)
		soo = num;
		
		int n = 10;
		Integer intObject = n;
		System.out.println("intObject = " + intObject); // Boxing
	
		int m = intObject + 10;
		System.out.println("m = " + m); // UnBoxing
	}

}
