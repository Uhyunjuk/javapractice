package com.kh.day15.listcollection;

public class RList<T> {	// Generic �ƹ��ų� �� �� �� �ִ�
	private Object [] Objects;
	private int size;
	
	public RList() {
		Objects = new Object[3];
		size = 0;
	}
	
	public void add(T input) {
		Objects[size] = input;
		size++;
	}
	// ���ϰ��� ������ ���ϰ��� �ڷ�����
	// �޼ҵ� ��ȯ��(void�ڸ�)�� �����ش�
	public T get(int index) {
		return (T)Objects[index];	// nums[0] �� 1
	}
	
	public int size() {
		return size;
	}

	public void clear() {
		Objects = new Object[3];
		size = 0;
	}
}
