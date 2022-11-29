package com.kh.day05.array;

public class Exam_ArrraySort {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 23;
		System.out.println("num1 : " + num1 + ", num2 : " + num2);

		// num1�� num2�� �ٲٱ�
		int temp = num1; // temp = 11
		num1 = num2; // num1 = 22
		num2 = temp; // num2 = 11
		System.out.println("num1 : " + num1 + ", num2 : " + num2);

		// 1,2,3���� �ٲٱ� (2�� 1�� �ٲٸ��)
		int[] nums = {2, 1, 3};
		temp = nums[0]; // temp = 2
		nums[0] = nums[1]; // 2->1
		nums[1] = temp; // 1->2
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		// {1,2,3} 
		
		// 3,2,1�� �ٲٱ�
		temp = nums[0]; // temp = 1
		nums[0] = nums[2]; // 1->3
		nums[2] = temp; // 3->1
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}
}
