package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		OutputStream os = null;

		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			//"Hello I/O";
			byte[] data = "Hello I/O".getBytes();
			os.write(data[0]);
			os.flush(); // 쓸때는 공간 한번 비워주기
			System.out.println("쓰기완료!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
