package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		// indent ���� : ctrl + shift + f
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է����ּ���.");
		String name = sc.next(); 

		System.out.print("�¾ ���� �Է����ּ���.");
		int month = sc.nextInt();

		System.out.print("Ű�� �Է����ּ���.");
		double height = sc.nextDouble();

		System.out.print("������ �Է����ּ���.");
		char gender = sc.next().charAt(0);

		System.out.print("�ּҸ� �Է����ּ���.");
		sc.nextLine(); // ���� ����!!
		String address = sc.nextLine(); // �ּҰ��� ��� nextLine���
			// ���� �Է��ϰ� ���ʹ����� �ؽ�Ʈ������ ���� ����
			// �ؽ�Ʈ���� �����ٰ� �ѹ��� �������

		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("�¾ ���� " + month + "�� �Դϴ�.");
		System.out.println("Ű�� " + height + "cm �Դϴ�.");
		System.out.println("������ " + gender + "�� �Դϴ�.");
		System.out.println("�ּҴ� " + address + "�Դϴ�.");

		sc.close(); // ��ĳ�ʴݱ�

//		�̸��� �Է����ּ���. // next()
//		�κ���
//		�¾ ���� �Է����ּ���.
//		9
//		Ű�� �Է����ּ���.
//		180
//		������ �Է����ּ���.
//		��
//		�ּҸ� �Է����ּ���. // nextLine()
//		����� ���α�

//		�̸��� �κ����Դϴ�.
//		�¾ ���� 9�Դϴ�.
//		Ű�� 180.0�Դϴ�.
//		���������Դϴ�.
//		�ּҴ� ����� ���α��Դϴ�.

	}
}
