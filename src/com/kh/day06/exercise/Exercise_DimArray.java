package com.kh.day06.exercise;

public class Exercise_DimArray {
	public void exercise1() {
		// 5 4 3 2 1
		// 10 9 8 7 6
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		int[][] arrs = new int[5][5];
		int k = 1;
		arrs[0][0] = 0;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = arrs.length - 1; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d", arrs[i][j]);
			}
			System.out.println();
		}

	}

	public void exercise2() {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21
		int[][] arrs = new int[5][5];
		int k = 1;
		arrs[0][0] = 0;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = arrs.length - 1; j >= 0; j--) { // 0���������ؾ���
				arrs[j][i] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise3() {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25

		int[][] arrs = new int[5][5];
		int k = 1;
		arrs[0][0] = 0;
		for (int i = 0; i < arrs.length; i++) { // i������ 00 10 20 30 40
			for (int j = 0; j < arrs[i].length; j++) { // ����
				arrs[j][i] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise4() {
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25

		// ��Ģ
		// 00 01 02 03 04
		// 14 13 12 11 10
		// 20 21 22 23 24
		// 34 33 32 31 30
		int[][] arrs = new int[5][5];
		int k = 1;
		arrs[0][0] = 0;
		for (int i = 0; i < arrs.length; i++) {
			if (i % 2 == 0) { // i�� ¦�������� + j�� ����
				for (int j = 0; j < arrs[i].length; j++) {
					arrs[i][j] = k++;
				}
			} else { // Ȧ���϶� ����
				for (int j = arrs.length - 1; j >= 0; j--) {
					arrs[i][j] = k++;
				}
			}
		}
		// ���
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d", arrs[i][j]);
			}
			System.out.println();
		}

	}

	public void exercise5() {
		// 2���� �迭�� �г⺰�� 1,2�б� �������� �����ϰ�
		// 4�Ⱓ ��ü��������� ����϶�

		double[][] score = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };
		double sum = 0;
		for (int i = 0; i < score.length; i++) { // �� �г⺰�� �ݺ�
			for (int j = 0; j < score[i].length; j++) { // �� �г��� �б⺰�� �ݺ�
				sum += score[i][j];
			}
		}
		int n = score.length; // �� ���� 4
		int m = score[0].length; // �� ���� 2
		System.out.println("4�� ��ü ���� ����� " + sum / (n * m));
	}
}
