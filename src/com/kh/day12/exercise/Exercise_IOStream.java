package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {
	public void fileCopy() {
		// �̹��� ���� ����
		// C:\\img\\moomeokpan.png -> D:\\moomeok.png
		// ����Ʈ ��� �Է½�Ʈ���� ��½�Ʈ�� ���

		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("C:\\img\\moomeokpan.png");
			os = new FileOutputStream("D:\\moomeok.png");
			byte[] readBytes = new byte[100];
			int readByteNo;
			while ((readByteNo = is.read(readBytes)) != -1); { // ���� �б� ����
				os.write(readBytes, 0, readByteNo); // �����ͺ��� ���ٵȰű���
			}
			System.out.println("���簡 �Ϸ�Ǿ����ϴ� !");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	
	public void memoFileMake() {
		/*
		 * ������ ���ϸ� �Է� : khtext.txt 
		 * 'khtext.txt'' ���Ͽ� ����� ���� �Է� : 
		 * ����� exit 
		 * 1 : 1111
		 * 2 : text input 
		 * 3 : good 
		 * 4 : gogogo 
		 * 5 : exit ���� ���� �Ϸ� (exit�� �����ϰ� ����)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ� �Է� : ");
		// ���� ���� -> ���� ����°� ��Ʈ������
		String fileName = sc.next();
		Writer writer = null; // ���� ������� writer

		try {
			writer = new FileWriter("src/iostream/" + fileName);
			System.out.println("'" + fileName + "'" + " ���Ͽ� ����� ������ �Է��ϼ���");
			System.out.println("����� exit�� �Է��ϼ���!");
			sc.nextLine();

			int i = 1; // ����� �ʱ�ȭ�� �ѹ���
			while (true) {
				System.out.print(i + " : ");
				String input = sc.nextLine();
				if (input.equals("exit"))
					break;
				writer.write(input);
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

//			while(true) {
//				for(int i = 1; i<=5; i++) {
//					System.out.print(i + " : ");
//					String input = sc.nextLine();
//					writer.write(input);
//				}
//				System.out.println("���� ���� �Ϸ�");
//				if("exit".equals(input)) { // ��Ʈ�� �񱳽� �ݵ�� equals()�� ���
//					writer.close();
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}