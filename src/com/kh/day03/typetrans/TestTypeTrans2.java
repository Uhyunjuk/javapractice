package com.kh.day03.typetrans;

public class TestTypeTrans2 {

	public static void main(String[] args) {
		byte b = 127; //1byte
		int i = 100; //4byte
		
		// 자동 형변환
		// 작->큰
		System.out.println(b+i); // b는 int로 자동형변환
		System.out.println(10/4); 
		System.out.println(10.0/4); // 4(int)는 4.0(double)로 자동형변환

		System.out.println(); 

		// 강제 형변환
		// 큰->작, 데이터손실발생
		System.out.println((byte)b+i);
		System.out.println((int)2.9 + 1.8); // 2 + 1.8
		System.out.println((int)(2.9 + 1.8)); // 4.0 -> 4
		System.out.println((int)2.9 + (int)1.8);  // 2 + 1

	}

}
