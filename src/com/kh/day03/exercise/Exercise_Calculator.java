package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {

	public static void main(String[] args) {
		// �ΰ��� ������ �Է¹ް� �����ڸ� �Է¹޾Ƽ�
		// ����ϴ� ���� ���α׷��� �ۼ��ϼ���
		// ������ �Է����ּ��� : 11
		// ������ �ѹ� �� �Է����ּ��� : 22
		// �����ڸ� �Է����ּ���(+,-,*,/,%) : %
		// ��� : 11 % 22 = 11

		Scanner sc = new Scanner(System.in);

		// 1. ���� �ϳ� �Է� ����
		System.out.print("������ �Է����ּ���. :");
		int num1 = sc.nextInt();

		// 2. ���� �ϳ� �� �Է� ����
		System.out.print("������ �ѹ� �� �Է����ּ���. :");
		int num2 = sc.nextInt();

		// 3. ������ �Է� ����
		System.out.print("�����ڸ� �Է����ּ���. (+,-,*,/,%) :");
		char operator = sc.next().charAt(0);

		// 4. ������ �Ǻ� �� ���� ���� �� ��� ����
		int result = 0;

		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			result = num1 / num2;
		} else if (operator == '%') {
			result = num1 % num2;
		}

		// 5. ��� ���
		System.out.println("��� : " + num1 + " " + operator + " " + num2 + " = " + result);

		/*
		 * int result = 0;
		 * 
		 * switch (oper) { case "+" : result = (num1 + num2); break; case "-" : result =
		 * (num1 - num2); break; case "*" : result = (num1 * num2); break; case "/" :
		 * result = (num1 / num2); break; case "%" : result = (num1 % num2); break; }
		 * if(result != 0) { System.out.print("��� : " + num1 + oper + num2 + " = " +
		 * result);
		 * 
		 * sc.close(); }
		 */

	}

}
