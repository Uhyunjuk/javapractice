package com.kh.day02.variable;

public class TestDataType {
	public static void main(String [] args) {
		// �ڷ��� ������ ���Կ����� ������ ;
		// 1. �ڷ����� ����
		// ����, ���ڿ�
		// int, String
		// ���� part
		byte bNum = 127; // -128~127
		short sNum = 32767; // -32768~32767
		int iNum = 2147483647; // -2147483648 ~ 2147483467
		long lNum = 2147483648l; // ���̻� l�� �ٿ�����
		short num = 128;
		
		//�Ǽ� part - ��ձ��Ҷ� ���� ���
		float fNum = 22.1123f; //���̻� f�� �ٿ�����
		double dNum = 23.502;
		
		//���� part
		char fChar = 'A'; // ''�ȿ��� 1���� ����
		String sChar = "Hello Java"; // ""�ȿ��� ���ڿ�
		
		//Boolean��
		boolean result = false;
		// 1>0, 2<1 ������ ������� ��Ÿ���� �ڷ���
		
		System.out.println("������ �� : " + iNum);
		System.out.println("������ ��(9999��) : " + lNum);
		System.out.println("�Ǽ��� �� : " + fNum);
		System.out.println("�Ǽ��� �� : " + dNum);
		System.out.println("������ �� : " + fChar);
		System.out.println("���ڿ��� �� : " + sChar);
		System.out.println("���� �� : " + result);
		
		fChar = 66;
		System.out.println("������ ���� : " + fChar);
		fChar = 75;
		System.out.println("������ ����2 : " + fChar);
		// ASCII �ƽ�Ű�ڵ�
		// -> ���ڴ� ���ڸ� ������ �� �ְ� �ƽ�Ű�ڵ忡 ���εǾ��ִ¹��ڷ���°���
		

		
	}
}
