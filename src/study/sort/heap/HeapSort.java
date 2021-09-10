package study.sort.heap;

import common.CommonUtil;
import study.sort.GyubSort;

public class HeapSort implements GyubSort{
	/**
	 * Heap Sort 
	 * ����Ʈ���� ���¸� ���߰� ������,
	 * ����Ʈ���� �ڽ��� ��尡 2���� ������ ��带 ����. 
	 * 
	 * ���⼭ Heap sort �� ��������Ʈ���� ���¸� ���߰� ����
	 * ��Ʈ ������ �����ؼ� �ڽ� ��尡 ���� �ڽ� ��� ���� ä������ ����
	 *  
	 *  Heap : ���� �ּڰ��̳� �ִ��� ������ ã�� ���� '��������Ʈ��'�� ������� �ϴ� Ʈ���̴�.
	 *  �̷��� ���� �ִ����� �ּ����� �ִ�.
	 *   - �ִ��� : '�θ���'�� '�ڽĳ��'���� ū ��
	 *   - �ּ��� : '�ڽĳ��'�� '�θ���'���� ū ��
	 *   
	 *   heap sort�� merge sort�� �ٸ��� ������ �߰����� �迭�� �ʿ����� �ʴٴ� ������,
	 *   ���� ȿ�����Դϴ�. ���� �׻� O(N * log N ) �� �����Ѵ�.
	 * */
	
	@Override
	public void sort(int[] array) {
		int size = array.length;
		
		// �ִ� �� ���� ��ȯ
		for( int i = (size/2) -1 ; i > -1; i--) {
			heapify(array, i, size);
		}
		
		// ����
		for( int j = size -1 ; j > 0; j--) {
			CommonUtil.swap(array, 0, j);
			heapify(array, 0, j);
		}
		
	}
	
	
	private void heapify(int [] array, int rootNode, int size) {
		int left = 2*rootNode +1;	// ���� ��� 
		int right = 2*rootNode +2;	// ������ ���
		int index = rootNode;
		
		// ���� & ���� �� ū �� Ȯ��
		if(left < size && array[left] > array[index]) {
			index = left;
		}
		
		if(right < size && array[right] > array[index]) {
			index = right;
		}
		
		// �������� �ڽ� ��� �ִ��� ���·�
		if(rootNode != index) {
			CommonUtil.swap(array, rootNode, index);
			heapify(array, index, size);
		}
	}
	

}


