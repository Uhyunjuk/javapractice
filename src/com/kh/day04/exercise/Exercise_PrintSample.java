package com.kh.day04.exercise;

public class Exercise_PrintSample {

	public static void main(String[] args) {
		// ���� + ���ڿ� -> ���ڿ�
		System.out.println(1 + "1");
		// "1" + "1" =  ���ڿ� "11"�� �����°���
		
		// ���� + ���� -> ����
		System.out.println('1' + '1');
		// 49 + 49 = 98�� �Ǿ������(���� �ƽ�Ű�ڵ� ���)
		
		// ���� + ���� + ���ڿ� + ���� -> ���ڿ�!
		// �߰��� ���ڿ��� ������ ���������� ���ڿ��� �ȴ�
		System.out.println(10 + 20 + "hello" + 10);
		
		//printf�� ���ؼ� �˾ƺ���
		//println, print -> �ٹٲ��� ����
		System.out.print("���� �Է� : "); // �ٷ� ���� �Է¹���
		System.out.println("���� �Է� : "); // �ٹٲٰ� �Է¹���
		System.out.printf("���� ��� : %d \n", 1); // ,�ڿ� ����ϰ������ ����
		System.out.printf("���ڿ� ��� : %s", "Hello World");
		// ������ %d, ���ڿ��� %s, �ٹٲ�:\n
	}
}
