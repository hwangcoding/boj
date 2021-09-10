package study.sort.heap;

import common.CommonUtil;

public class HeapTest {
	public static void heapSort(int[] arr) {
        int n = arr.length;

        // maxHeap�� ����
        // n/2-1 : �θ����� �ε����� �������� ����(i*2+1) ������(i*2+2)
        // �� �ڽĳ�带 ���� ��Ʈ�� �ִ� ��������
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i); // �Ϲ� �迭�� ������ ����
        }

        for (int i = n - 1; i > 0; i--) {
            CommonUtil.swap(arr, 0, i);
            heapify(arr, i, 0); // ��Ҹ� ������ �� �ٽ� �ִ����� ����
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        // ���� �ڽĳ��
        if (l < n && arr[p] < arr[l])
            p = l;
        // ������ �ڽĳ��
        if (r < n && arr[p] < arr[r])
            p = r;

        // �θ��� < �ڽĳ��
        if (i != p) {
        	CommonUtil.swap(arr, p, i);
            heapify(arr, n, p);
        }
    }
}
