package com.kh.day11.exercise;

public class Exercise_Wrapper {
	public void paserExample() {
		String strNum = "22123";
		String strNum2 = "230502";
		// �� ���� ����ؼ� ����Ͻÿ�
		// ��� : 201819
		int result = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
		System.out.println("��� : " + result);

	}

	public void dataParsingExample() {
		String strData = "221213";
		String strData2 = "23.502";
		String strData3 = "SPRING";

		// 1. strData�� byte, short, int, long���� ��ȯ�Ͻÿ�
		byte bNum = Byte.parseByte(strData);
		short sNum = Short.parseShort(strData);
		int iNum = Integer.parseInt(strData);
		long lNum = Long.parseLong(strData);

		// 2. strData2�� float, double�� ��ȯ�Ͻÿ�
		float f = Float.parseFloat(strData2);
		double d = Double.parseDouble(strData2);

		// 3. strData3�� char�� ��ȯ�Ͻÿ�.
		char word = strData3.charAt(0); // ���ڿ�->���� �̰Źۿ�����!
		
	}
}
