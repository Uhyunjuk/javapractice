package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 30; i++) {
			System.out.println(rand.nextInt(45) + 1); 
			
		}
		
		// nextInt(n) -> 0���� n-1������ ������ �� ����
		// 1���� 10������ �� �߿��� ������ ���� �̰� ������ -> nextInt(10) + 1
		// nextInt(10)+1, �� +1�� ������ �����Ѵ�!
		
		// ex1. 20���� 35������ �� �߿��� ������ ���� �̰� �ʹٸ�?
		// nextInt(16) + 20
		
		// ex2. 10���� 23 ������ �� 
		// nextInt(14) + 10 
		
		// ex.3 �ζǹ�ȣ (1~45)
		// nextInt(45) + 1
		
		// nextInt(a) + b
		// b�� �����ϴ� ���� �ְ� a�� ������ ���̰��� ������ ��
		
		
		
		
	}
}

