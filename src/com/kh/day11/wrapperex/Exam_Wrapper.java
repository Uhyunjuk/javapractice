package com.kh.day11.wrapperex;

public class Exam_Wrapper {
// �������� ȣ���ؼ� �����ִ� �޼ҵ��
	public static void main(String[] args) {
		int num = 0;
//		Integer soo = new Integer(0); // �������������, ����������x
		Integer su = Integer.valueOf(0);
		
		System.out.println(Character.toLowerCase('A')); // �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) { // 
			System.out.println(c1 + "�� ����");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "�� ������");
		}
	}

}
