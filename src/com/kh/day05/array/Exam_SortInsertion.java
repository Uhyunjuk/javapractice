package com.kh.day05.array;

public class Exam_SortInsertion {

	public static void main(String[] args) {
		// 정렬 알고리즘
		// 1. 삽입정렬이란?
		// 정렬 알고리즘 중에 하나이면서 가장 간단하고 기본이 되는 알고리즘
		// 배열의 n번 인덱스값을 0번에서 n-1번 인덱스까지 비교 !
		// 두번째 자료부터 시작하여 그 앞쪽 자료들과 비교하여 정렬함
		
		// {2, 5, 4, 1, 3}
		/* i = 0
		 * 2, 5, 4, 1, 3 // 1번째 결과(=숫자1개비교)
		 * i = 1
		 * 2, 5, 4, 1, 3 
		 * 2, 4, 5, 1, 3 // 2번째 결과(=숫자2개비교)
		 * i = 2 
		 * 2, 4, 1, 5, 3 
		 * 2, 1, 4, 5, 3
		 * 1, 2, 4, 5, 3 // 3번째 결과
		 * i = 3
		 * 1, 2, 4, 3, 5
		 * 1, 2, 3, 4, 5 
		 * 1, 2, 3, 4, 5
		 * 1, 2, 3, 4, 5 // 4번째 결과
		 */

		int[] arrs = {2, 5, 4, 1, 3};
		for(int i = 1; i < arrs.length; i++) {
			for(int j = 0; j<5; j++) {
				if(arrs[j-1] > arrs[j]) {
					int temp = arrs[j-1];
					arrs[j-1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		//배열출력
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
	
}


