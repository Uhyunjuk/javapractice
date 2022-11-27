package com.kh.day03.typetrans;

public class TestTypeTrans1 {

	public static void main(String[] args) {
		//자동 형변환(작->큰)
		int iNum = 10; // 4byte
		double dNum = 13.2; // 8byte
		double result = iNum +dNum; 
		System.out.println(result);
		
		System.out.println("강제 형변환 : " + (int)result); //double->int)
		System.out.println("강제 형변환 : " + (char)65);// (int->char)
		
	}
	
}
