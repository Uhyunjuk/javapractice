package com.kh.day03.typetrans;

public class TestTypeTrans1 {

	public static void main(String[] args) {
		//�ڵ� ����ȯ(��->ū)
		int iNum = 10; // 4byte
		double dNum = 13.2; // 8byte
		double result = iNum +dNum; 
		System.out.println(result);
		
		System.out.println("���� ����ȯ : " + (int)result); //double->int)
		System.out.println("���� ����ȯ : " + (char)65);// (int->char)
		
	}
	
}
