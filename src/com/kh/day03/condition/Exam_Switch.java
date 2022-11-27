package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Switch {

	public static void main(String[] args) {
		// 1. �Է�
		// 2. ����
		// 3. ��ȸ
		// 4. ����
		// 0. ����
		// �޴� ��ȣ�� �Է��ϼ��� : 3
		// ��ȸ�޴��Դϴ�.
		

		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("0. ����");
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		
		//switch-case�� ���ǽ� �ʿ����
		int choice = sc.nextInt();
		switch (choice) {
			case 1 :
				System.out.println("�Է¸޴��Դϴ�.");
				break;
			case 2 :
				System.out.println("�����޴��Դϴ�.");
				break;
			case 3 :
				System.out.println("��ȸ�޴��Դϴ�.");
				break;
			case 4 :
				System.out.println("�����޴��Դϴ�.");
				break;
			case 0 :
				System.out.println("����޴��Դϴ�.");
				break;
			default : System.out.println("0 ~ 4 ������ ���ڸ� �Է����ּ���.");
			
		}
		
		// �������� switch-case������ ���� ������
		
		
		
		
		
		
		
		/* if(choice == 1) {
			System.out.println("�Է¸޴��Դϴ�.");
		} else if(choice == 2) {
			System.out.println("�����޴��Դϴ�.");
		} else if(choice == 3) {
			System.out.println("��ȸ�޴��Դϴ�.");
		} else if(choice == 4) {
			System.out.println("�����޴��Դϴ�.");
		} else if(choice == 0) {
			System.out.println("����޴��Դϴ�.");
		}
		*/




		
	}

}
