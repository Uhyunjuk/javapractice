package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {

	public static void main(String[] args) {
//		while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް� 
//		-1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�.
//		���� �ϳ� �Է� : 3
//		���� �ϳ� �Է� : 4
//		���� �ϳ� �Է� : 7
//		���� �ϳ� �Է� : -1
//		�Է��Ͻ� ���� ���� : 14
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;
		
//		while (input != -1) { 	// input�� -1�� �ƴϸ� true = -1�� �Էµɶ����� ���ư�!
//		System.out.print("���� �ϳ� �Է� : ");
//		input = sc.nextInt();
////		sum += input; 	// sum = sum + input
//		if(input != -1) {
//			sum += input;
//		}
//	}

		//���ѹݺ��ڵ�
		while(true) {
			System.out.print("���� �ϳ� �Է� : ");
			input = sc.nextInt();
			// �Է��� ���� ���ϰ�
			// �Է��� ���� -1�̸� ������ �ʰ� ���ѹݺ� ����������!
			if(input == -1) break;
			sum += input;
		}
		

		System.out.println("�Է��Ͻ� ���� ���� : " + sum + "�Դϴ�.");
	}
}
