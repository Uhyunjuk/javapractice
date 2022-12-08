package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		Reader reader = null; // 전역변수

		// 문자기반입력스트림
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			int readCharNo;
			char[] cbuf = new char[2];
			String data = "";
			while (true) {
				readCharNo = reader.read(cbuf);
				if (readCharNo == -1)
					break;
				data += new String(cbuf, 0, readCharNo); // +=을 해줘야 누적이된게 모두 출력이 됨
			}
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}