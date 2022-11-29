package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {
		// ������
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1���� 10������ �� : " + sum);
	}

	public void exercise2() {
		// 1���� 10������ ������ ǥ���ϰ� �յ� ���Ͻÿ�
		// 1+2+3+4+5+6+7+8+9+10=55

		int sum = 0;

		for (int i = 1; i <= 10; i++) { // 1~10���� �ݺ�
			sum += i;
			System.out.print(i); // ���ϴ� �� ���

			if (i <= 9) { // 1~9������ +���
				System.out.print("+");
			} else {
				System.out.print("="); // 10���ʹ� = ����ϰ�
				System.out.print(sum); // ����������

			}
		}
	}

	public void exercise3() {
		// ������ ����ϱ� !
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ...
		// 2 * 9 = 18
		for (int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
	}

	public void exercise4() {
		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9 ������ ���϶���
		// �� ���� �������� ����ϼ���
		// ��, ������ ���� ������ "1 ~ 9������ ����� �Է��Ͽ��� �մϴ�"�� ����ϼ���

		Scanner sc = new Scanner(System.in);

//				int num; -> �������� ����
		System.out.print("1 ~ 9 ������ ���� �ϳ� �Է� : "); // 1 < dan < 9
		int dan = sc.nextInt();

		if ((dan >= 1) && (dan <= 9)) {
			for (int i = 1; i < 10; i++) {
//		              num = 0; -> �������� ����
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		} else {
			System.out.println("1 ~ 9������ ����� �Է��Ͽ��� �մϴ�.");
		}
//				System.out.printlnt(num);
	}
}
