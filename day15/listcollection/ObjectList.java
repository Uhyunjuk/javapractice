package com.kh.day15.listcollection;

public class ObjectList {
	private Object [] Objects;
	private int size;
	
	public ObjectList() {
		Objects = new Object[3];
		size = 0;
	}
	
	public void add(Object input) {
		Objects[size] = input;
		size++;
	}
	// ���ϰ��� ������ ���ϰ��� �ڷ�����
	// �޼ҵ� ��ȯ��(void�ڸ�)�� �����ش�
	public Object get(int index) {
		return Objects[index];	// nums[0] �� 1
	}
	
	public int size() {
		return size;
	}

	public void clear() {
		Objects = new Object[3];
		size = 0;
	}
}
