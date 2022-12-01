package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// 로또 번호 자동 생성기 프로그램, 중복없이 추출하기!
		// 단, 결과는 오름차순으로 정렬
		// 로또번호 : 6개
		// 로또 번호 범위 : 1 ~ 45

		int[] lotto = new int[6];

		// 로또번호뜨게하기
		Random rand = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			//중복제거
			for (int j = 0; j < i; j++) { // 비교횟수증가
				if (lotto[i] == lotto[j]) { // 비교는 이미 뽑은 것과 첫번째부터 ~
					i--;
					break;
				}
			}
		}

		// 버블정렬로 오름차순으로 뜨게하기
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}

			}

		}

		// 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
