package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i <= 30; i++) {
			System.out.println(rand.nextInt(16) + 20); 
			
		}
		
		// nextInt(n) -> 0���� n-1������ ������ �� ����
		// 1���� 10������ �� �߿��� ������ ���� �̰� ������ -> nextInt(10) + 1
		// nextInt(10)+1, �� +1�� ������ �����Ѵ�!
		
		// ex1. 20���� 35������ �� �߿��� ������ ���� �̰� �ʹٸ�?
		// nextInt(?)+? �ؾ��ұ��?
		// 20~35 (���� -20)
		// 0~15 -> nextInt(??)
		// ?? = (n-1 = 15) ->  n = 16
		// nextInt(16) + 20
		
		//ex2. 10���� 23 ������ �� 
		// nextInt() + 
	}
}

