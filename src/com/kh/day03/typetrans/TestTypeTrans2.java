package com.kh.day03.typetrans;

public class TestTypeTrans2 {

	public static void main(String[] args) {
		byte b = 127; //1byte
		int i = 100; //4byte
		
		// �ڵ� ����ȯ
		// ��->ū
		System.out.println(b+i); // b�� int�� �ڵ�����ȯ
		System.out.println(10/4); 
		System.out.println(10.0/4); // 4(int)�� 4.0(double)�� �ڵ�����ȯ

		System.out.println(); 

		// ���� ����ȯ
		// ū->��, �����ͼսǹ߻�
		System.out.println((byte)b+i);
		System.out.println((int)2.9 + 1.8); // 2 + 1.8
		System.out.println((int)(2.9 + 1.8)); // 4.0 -> 4
		System.out.println((int)2.9 + (int)1.8);  // 2 + 1

	}

}
