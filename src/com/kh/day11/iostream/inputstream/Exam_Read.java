package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		InputStream is = null; // �߻�Ŭ������ ��ü�����Ҽ� x, �׳� �ʱ�ȭ

		// FileInputStream -> Checked Exception
		// -> �ݵ�� try~catch ����� �ϴ� Exception
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			int readByte;
			while (true) {
				readByte = is.read();
				// ������ �׸� �о�� �ϴ� �ڵ� �����ֱ�
				if(readByte == -1) break;
				// Unreachable code
				System.out.print((char)readByte);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ����ó�� surround with try/catch������ �ڵ��ϼ���

	}

}
