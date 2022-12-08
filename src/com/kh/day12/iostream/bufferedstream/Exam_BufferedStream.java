package com.kh.day12.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {

	public static void main(String[] args) {
		// ���� ũ�⸦ 5�� �ϰ� ǥ�� ��½�Ʈ���� ������
		// ������� ��Ʈ���� �����϶�
		// C:\Temp/kh.txt ������ ����� ���� �ؽ�Ʈ�� �о�
		// ���� ��� ��Ʈ���� ���� ����϶� !

		FileReader fir = null;
		int readChar;
		int c;
		try {
			fir = new FileReader("C:\\Temp\\kh.txt");
			// �ܼ� ��¿�
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while ((readChar = fir.read()) != -1) {
				out.write(readChar);
			}
			new Scanner(System.in).nextLine(); // 5���� �о��� , ���͸� ����� ���ĺ� z�� ����
			out.flush(); // 5���߿� z, �Ѱ��� ���ִ»��´ϱ� flush�� �ϰ� z�� ���
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fir.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
