package study.sort.merge;

import study.sort.GyubSort;

public class MergeSort implements GyubSort {

	private static int [] temp;
	
	public void sort(int [] array) {
		temp = new int[array.length];
		sort(array, 0, array.length-1);
	}
	
	private void sort(int [] array, int left, int right) {
		/**
		 * ���� �ܰ�
		 *  ���� ���� ���� ����Ʈ�� �������� �߶� ����� ũ���� �� �κ� ����Ʈ�� ������ �۾�
		 *  left �� ����Ʈ�� ���� �ε����� ���ϸ�
		 *  right �� ����Ʈ�� ������ �ε����� ���Ѵ�.
		 *  ���� �ε����� ������ �ε��� ���� ũ�ų� ���� ���, ���̻� ���� �� �� ���ٰ� �Ǵ�
		 */
		if(left >= right) return;
		int middle = (left + right)/2;
		
		sort(array, left, middle);
		sort(array, middle+1, right);
		merge(array, left, middle, right);
	}
	
	
	private void merge(int [] array, int left, int middle, int right) {
		/*
		 * ���� �ܰ�
		 * �� �κ� ����Ʈ�� ��������� �պ� ������ �̿��� ����
		 * �� �κ� ����Ʈ�� �ٽ� �ϳ��� ���ĵ� ����Ʈ�� �պ��Ѵ�. �̶� ���� ����� �ӽù迭�� ����*/
		int i = left;
		int j = middle+1;
		int index = left;
		
		// �� �迭�� ���Ͽ� �ӽ� �迭�� ������������ ����
		while (i <= middle && j <= right) {
			if(array[i] < array[j]) {
				temp[index] = array[i];
				i++;
			}else {
				temp[index] = array[j];
				j++;
			}
			index++;
		}
		
		// �� �迭�߿� ���� �ӽ� �迭�� �Ҵ���� ���� �迭�� �� �Ҵ�
		while ( i <= middle) {
			temp[index] = array[i];
			index++;
			i++;
		}
		while ( j <= right) {
			temp[index] = array[j];
			index++;
			j++;
		}
		
		/*
		 * ����ܰ�
		 * �ӽ� �迭�� ����� ����� ���� �迭�� �����Ѵ�
		 * */
		for( int k = left; k <= right; k++) {
			 array[k] = temp[k];
		}
	}
	
}
