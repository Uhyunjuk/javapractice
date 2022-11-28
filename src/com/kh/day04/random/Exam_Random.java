package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 30; i++) {
			System.out.println(rand.nextInt(45) + 1); 
			
		}
		
		// nextInt(n) -> 0부터 n-1까지의 랜덤한 수 리턴
		// 1부터 10까지의 수 중에서 랜덤한 수를 뽑고 싶으면 -> nextInt(10) + 1
		// nextInt(10)+1, 즉 +1로 범위를 조정한다!
		
		// ex1. 20부터 35사이의 수 중에서 랜덤한 수를 뽑고 싶다면?
		// nextInt(16) + 20
		
		// ex2. 10부터 23 사이의 수 
		// nextInt(14) + 10 
		
		// ex.3 로또번호 (1~45)
		// nextInt(45) + 1
		
		// nextInt(a) + b
		// b에 시작하는 숫자 넣고 a는 나머지 차이값을 넣으면 됨
		
		
		
		
	}
}

