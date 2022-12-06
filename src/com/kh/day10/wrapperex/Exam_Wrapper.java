package com.kh.day10.wrapperex;

public class Exam_Wrapper {
	public static void main(String [] args) {
		// Wrapper ��ü�κ��� �⺻ Ÿ�� �� �˾Ƴ���
		Integer i = Integer.valueOf(1234); // ��ü�� ���� ����ϴٰ�
		int e = i.intValue(); // �⺻�����ε� ��ȯ����
		Integer f = null;
		// int m = null;
		
		Character c = Character.valueOf('c');
		char che = c.charValue();
		
		Double d = Double.valueOf(3.14);
		double dd = d.doubleValue();
		
		// ���ڿ��� �⺻ ������ Ÿ��(int, boolean, double)���� ��ȯ
//		int num = "123";
		int num = Integer.parseInt("123");
		System.out.println("��ȯ�� �� : " + num);
		
//		boolean b = "true";
		boolean b = Boolean.parseBoolean("true");
		System.out.println("��ȯ�� �� : " + b);
		
//		double f = "3.14";
		double fNum = Double.parseDouble("3.14");
		System.out.println("��ȯ�� �� : " + fNum);
		
		// �⺻ ������Ÿ��(int, double, char)�� ���ڿ��� ��ȯ
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123); // 16������ ��ȯ
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);
		
		System.out.println(data2);
	}
}
