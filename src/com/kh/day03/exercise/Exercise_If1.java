package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {
		// ���� �ϳ��� �Է¹޾Ƽ� ������������ 0���� ������������
		// �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ϳ��� �Է����ּ��� : ");
		int input = sc.nextInt();
		String result = ""; // ���� �ʱ�ȭ (�̷����ϸ� �ؿ� ����Ʈ�ϳ��ϳ� �������)

		if (input > 0) {
			result = "���� ����";
		} else if (input == 0) {
			result = "0";
		} else {
			result = "���� ����";
		}
		System.out.println(input + "��/�� " + result + "�Դϴ�.");
		
		sc.close();
	}
}
