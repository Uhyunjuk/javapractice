package com.kh.day10.interfaceex;

public class SamsungPhone implements PhoneInterface { // �������̽� ����
// interface�� ���� �߻�޼ҵ���� ����ٰ� ��� ����

	@Override
	public void sendCall() {
		System.out.println("�츮������");
	}

	@Override
	public void receiveCall() {
		System.out.println("��������");
	}

	@Override
	public void printLogo() {
		System.out.println("===== Apple =====");
	}

	@Override
	public void displayNumber() {
		System.out.println("�� �޴���ȭ ���� : 123-456-789");
	} 
	
	// �߰��޼ҵ��ۼ�
	public void flash() {
		System.out.println("��¦��¦ �÷��ð� �������ϴ�.");
	}
	
}
