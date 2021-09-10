package common;

import java.io.IOException;

import study.sort.GyubSort;

public class CommonUtil {

	public static <T> void sort(GyubSort t, int [] array) {
		long start,end;
		start = System.currentTimeMillis();
		t.sort(array);
		end = System.currentTimeMillis();
//		CommonUtil.printArray(array);
		System.out.println( "���� �ð� : " + ( end - start )/1000.0 +"��"); //���� ����ð�
	}
	
	/**
	 * �迭 �ε��� ��ü
	 * @param arr
	 * @param selectIDX
	 * @param swapIDX
	 * @return
	 */
	public static int[] swap(int [] arr, int selectIDX, int swapIDX) {
		int temp = arr[selectIDX];
		arr[selectIDX] = arr[swapIDX];
		arr[swapIDX] = temp;
		return arr;
	}
	
	/**
	 * �迭 ���
	 * @param arr
	 */
//	public static void printArray(int [] arr) {
//		for( int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + ",");
//		}
//		System.out.println();
//	}
	public static void printArray(int [] array) {
		try {
			StringBuilder sb = new StringBuilder();
			for(int i : array) {
				sb.append(i).append(",");
			}
			System.out.println(sb);
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}
	
	public static int[] randomArray(int size) {
		int [] array = new int [size];
		
		int min = 1;
		int max = 1000000;
		for(int i = 0 ; i < size; i++) {
			array[i] = (int) ((Math.random() * (max - min)) + min);
		}
		return array;
	}
}
	