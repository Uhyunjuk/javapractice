package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {

	public static void main(String[] args) {
//		Exercise_Lotto exlotto = new Exercise_Lotto();
//		exlotto.lottoProgram();

		Person person = new Person();
//		person.eat();
//		person.sleep();
//		person.speak();
//		person.walking();
		
		Scanner sc = new Scanner(System.in);
		// rect : ���۷��� ���� ����, ��������, �ּҰ� ����Ǵ� ����
		Rectangle rect = new Rectangle(); // ��ü����, �ݵ��newŰ�����̿�
										  // new�� ��ü ������ ȣ��
		System.out.print("�ʺ� �Է����ּ��� : ");
		// ��ü�� �������(����� �����δ� ��� ������ ��� �޼ҵ�)
		// �ν��Ͻ� : RectangleŬ������ ��ü
		rect.width = sc.nextInt(); // .���� ������� ����
		System.out.print("���̸� �Է����ּ��� : ");
		rect.height = sc.nextInt(); // ������� ����
		int result = rect.getArea(); // ����޼ҵ� ����
		System.out.println("�簢���� ������ : " + result);
	}
}
