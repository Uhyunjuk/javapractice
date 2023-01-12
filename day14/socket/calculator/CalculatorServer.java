package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
	public static void main(String [] args) {
		ServerSocket serverSocket = null;
		int port = 8989;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			System.out.println("���� �������Դϴ�.");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�...");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			while(true) {
				// ���� �޽��� : 12 + 1
				String msg = dis.readUTF();
				if(msg.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
					break;
				}
				System.out.println("���� �޽��� : " + msg);
				// ������ ������
				String[] msgArrs = msg.split(" ");
				if(msgArrs.length !=3) {
					msg = "end";
					dos.writeUTF(msg);
					continue;
				}
				int num1 = Integer.parseInt(msgArrs[0]);
				String operator = msgArrs[1];
				int num2 = Integer.parseInt(msgArrs[2]);
				String result = "";
				switch (operator) { // ����� ���� �ΰ����� �ۼ� ����
				case "+": result = num1 + num2 + ""; break;
				case "-": result = String.valueOf(num1 - num2); break;
				case "*": result = String.valueOf(num1 * num2); break;
				case "/": result = num1 / num2 + ""; break;
				case "%": result = num1 % num2 + ""; break;
				default: result = "�����ڸ� �߸��Է��ϼ̽��ϴ�."; break;
				}
				dos.writeUTF(result);
				// ��� ������ �Ϸ�
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
