package com.kh.day05.array;

public class Exam_SortBubble {
	public static void main(String[] args) {
		// ���� �˰���
		// 3. ���������̶�?
		// ������ �ΰ��� ���Ҹ� �˻��Ͽ� �����ϴ� ��� 
		// ������ ���ٴ� ������ �ְ�, �̹� ���ĵ� �����͸� ������ �� ���� ����
		// �⺻������ �ٸ� ���Ŀ� ���� ���� �ӵ��� ������
		// �������� �����Ҷ� ���� ����
		
		// {2, 5, 4, 1, 3}     // �տ� �ΰ��� ��!, ū�����Ͽ���������
		// i=0�϶� 			   // ó���� �迭ũ��-1 ��ŭ, ���� �پ��
		// 2, 5, 4, 1, 3
		// 2, 4, 5, 1, 3
		// 2, 4, 1, 5, 3
		// 2, 4, 1, 3, 5
		
		// i=1�϶�
		// 2, 4, 1, 3, 5
		// 2, 1, 4, 3, 5
		// 2, 1, 3, 4, 5
		
		// i=2�϶�
		// 1, 2, 3, 4, 5
		// 1, 2, 3, 4, 5
		
//		int[] arrs = {2, 5, 4, 1, 3};
//		for (int i = 0; i < arrs.length-1; i++) {
//			for(int j = 0; j < (arrs.length-1)-i; j++) {
//				if(arrs[j] > arrs[j+1]) {
//					int temp = arrs[j+1];
//					arrs[j+1] = arrs[j];
//					arrs[j] = temp;
//				}
//			}
//		}
//		for(int i = 0; i < arrs.length; i++) {
//			System.out.print(arrs[i] + " ");
//		}
		
		int i, j, temp;
		int [] arr = {1, 9, 4, 6, 11, 10, 3, 15, 2, 13};
		for (i = 0; i < 10; i++){
			for(j = 0; j < 9 - i; j++) {
				if(arr[j] > arr[j+1]){
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
				}
			}
		}
		for (i = 0; i < 10; i++){
			System.out.print(arr[i] + " ");
		}
		}
}
