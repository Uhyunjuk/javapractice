package com.kh.day10.interfaceex;

public interface PhoneInterface { // �������̽� ����
//	private String name; // private �ȵ�
	public String NAME = ""; // ��� �빮�ڷ�, ��￩��(static�����Ǿ�����)
//	name = "Hello World"; // ����x, ������̶� �ٲ��� ����.
	public static final int TIME_OUT = 10000; // ����ʵ� ����(�빮�ڷ�)
	public void sendCall(); // �߻�޼ҵ� �̷��� �ᵵ ����
	public abstract void receiveCall(); // �̷��� �ᵵ ����
	abstract void printLogo(); // �̷��� �ᵵ ����
	void displayNumber(); // �̷��� �ᵵ ����
	default void showLogo() { // default �޼ҵ�(�ڹ�8�߰�)
		// ���� ȣȯ���� �����ϰ� �������̽��� ������ ���� �ۼ���.
		System.out.println("** LG **");
	}
}

