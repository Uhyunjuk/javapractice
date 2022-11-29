package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		// ���̰� 100�� �迭�� �����ϰ� 1���� 100������ ����
		// ������� �־� �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		int[] nums = new int[100]; // nums[0]~nums[99]
		for (int i = 1; i < nums.length; i++) { 
			nums[i] = i; // 1~99��ŭ ����ְ� ���
			System.out.print(nums[i] + " ");
		}
	}

	public void exercise2() {
		// ���̰� 5�� String �迭�� �����ϰ�
		// "����", "������", "Ű��", "���", "�ٳ���"��
		// �ʱ�ȭ �� ��, for���� Ȱ���ؼ� �ٳ����� ������ �ٳ����� ����غ�����!

		String[] fruits = new String[5];
		// ���۾�
		fruits[0] = "����";
		fruits[1] = "������";
		fruits[2] = "Ű��";
		fruits[3] = "���";
		fruits[4] = "�ٳ���";

		// ���ϰ��ϴ¹� -> �Ҵ�� �ʱ�ȭ�� ���ÿ� !
		String[] fruitGoods = { "����", "������", "Ű��", "���", "�ٳ���" };
		for (int i = 0; i < fruitGoods.length; i++) {
			if (fruitGoods[i] == "������") {
				System.out.println(fruitGoods[i]);
			}
		}
	}

	public void exercise3() {
		// ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		// �Է¹��� ������ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int[] arrs = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� 5���� �Է��ϼ���. : ");
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			sum += arrs[i]; // sum = sum + arrs[i];
		}
		// ����� ���� / �����Ͱ���
		// System.out.println("����� " + sum/5 + "�Դϴ�.");
		System.out.println("����� " + (double)sum / arrs.length + "�Դϴ�.");
	}

	public void exercise4() {
		// ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		// ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int[] nums = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("��� 5���� �Է��ϼ��� : ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("���� ū ���� : " + max + "�Դϴ�.");
	}

	public void exercise5() {
		// ����ڿ��� �ֹι�ȣ�� �Է� ���� ��
		// ���� �ڸ� ���ĺ��� *�� ����Ǿ� ��µǵ��� ���α׷��� �ۼ��Ͻÿ�.
		// 210618-1124399 -> 210618-1******

		Scanner sc = new Scanner(System.in);
		char[] origin = new char[14];
		System.out.print("�ֹε�Ϲ�ȣ �Է�(-����) : ");
		String memberNum = sc.next();
		// String���� �Է¹��� ���� �ϳ��� �߶� origin ���ڹ迭�� �ֱ�
		for (int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
//			System.out.print(origin[i]);
		}

		// char[] copy = origin; // ���� ���� -> �ǵ��� ��� ������ ����
		char[] copy = new char[14]; // ���� ������ ����! ���Ӱ� �Ҵ��������
		for (int i = 0; i < origin.length; i++) {
			if (i < 8) {
				copy[i] = origin[i];
			} else {
				copy[i] = '*';

			}
			System.out.print(copy[i]);
		}
		System.out.println();
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]); // �������
		}

	}

}
