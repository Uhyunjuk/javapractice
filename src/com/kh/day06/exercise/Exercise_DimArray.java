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
			for (int j = arrs.length - 1; j >= 0; j--) { // 0까지감소해야함
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
		for (int i = 0; i < arrs.length; i++) { // i값고정 00 10 20 30 40
			for (int j = 0; j < arrs[i].length; j++) { // 증가
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

		// 규칙
		// 00 01 02 03 04
		// 14 13 12 11 10
		// 20 21 22 23 24
		// 34 33 32 31 30
		int[][] arrs = new int[5][5];
		int k = 1;
		arrs[0][0] = 0;
		for (int i = 0; i < arrs.length; i++) {
			if (i % 2 == 0) { // i가 짝수로증가 + j값 증가
				for (int j = 0; j < arrs[i].length; j++) {
					arrs[i][j] = k++;
				}
			} else { // 홀수일때 감소
				for (int j = arrs.length - 1; j >= 0; j--) {
					arrs[i][j] = k++;
				}
			}
		}
		// 출력
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d", arrs[i][j]);
			}
			System.out.println();
		}

	}

	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체평점평균을 출력하라

		double[][] score = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };
		double sum = 0;
		for (int i = 0; i < score.length; i++) { // 각 학년별로 반복
			for (int j = 0; j < score[i].length; j++) { // 각 학년의 학기별로 반복
				sum += score[i][j];
			}
		}
		int n = score.length; // 행 개수 4
		int m = score[0].length; // 열 개수 2
		System.out.println("4년 전체 평점 평균은 " + sum / (n * m));
	}
}
