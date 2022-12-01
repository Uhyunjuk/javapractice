package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// �ζ� ��ȣ �ڵ� ������ ���α׷�, �ߺ����� �����ϱ�!
		// ��, ����� ������������ ����
		// �ζǹ�ȣ : 6��
		// �ζ� ��ȣ ���� : 1 ~ 45

		int[] lotto = new int[6];

		// �ζǹ�ȣ�߰��ϱ�
		Random rand = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			//�ߺ�����
			for (int j = 0; j < i; j++) { // ��Ƚ������
				if (lotto[i] == lotto[j]) { // �񱳴� �̹� ���� �Ͱ� ù��°���� ~
					i--;
					break;
				}
			}
		}

		// �������ķ� ������������ �߰��ϱ�
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}

			}

		}

		// ���
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
