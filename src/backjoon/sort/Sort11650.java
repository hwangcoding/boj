package backjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Description : ����. ��ǥ��� 1<br>
 * Date : 2021. 8. 25.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 8. 26., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Sort11650 {
	static int [][] temp = new int [100001][2];
	public static void main(String [] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int size = Integer.parseInt(br.readLine());
			int[][] coordination = new int[size][2];
			
			for(int i = 0 ; i < size; i ++) {
				coordination[i]= Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			}
			
			sort(coordination, 0, coordination.length-1);
			printArray(coordination);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void sort(int [][] array, int start, int end) {
		if( start >= end) return;
		
		int mid = (start + end)/2;
		sort(array, start, mid);
		sort(array, mid+1, end);
		merge(array, start, mid, end);
	}
	
	public static void merge(int [][] array, int start, int mid, int end) {
		int i = start;
		int j = mid +1 ;
		int key = start;
		
		while(i <= mid && j <= end) {
			if( array[i][0] == array[j][0]) {
				if( array[i][1] < array[j][1]) {
					temp[key] = array[i];
					i++;
				}else{
					temp[key] = array[j];
					j++;
				}
			}else {
				if( array[i][0] < array[j][0]) {
					temp[key] = array[i];
					i++;
				}else{
					temp[key] = array[j];
					j++;
				}
			}
			key++;
			
		}
		
		while(i <= mid) {
			temp[key] = array[i];
			i++;
			key++;
		}
		while(j <= end) {
			temp[key] = array[j];
			j++;
			key++;
		}
		
		for(int k = start; k <= end; k++) {
			array[k] = temp[k];
		}
	}
	
	public static void merge2(int [][] array, int start, int mid, int end) {
		int i = start;
		int j = mid +1 ;
		int key = start;
		
		while(i <= mid && j <= end) {
			if( array[i][0] == array[j][0]) {
				if( array[i][1] < array[j][1]) {
					temp[key] = array[i];
					i++;
				}else{
					temp[key] = array[j];
					j++;
				}
			}else {
				if( array[i][0] < array[j][0]) {
					temp[key] = array[i];
					i++;
				}else{
					temp[key] = array[j];
					j++;
				}
			}
			key++;
			
		}
		
		while(i <= mid) {
			temp[key] = array[i];
			i++;
			key++;
		}
		while(j <= end) {
			temp[key] = array[j];
			j++;
			key++;
		}
		
		for(int k = start; k <= end; k++) {
			array[k] = temp[k];
		}
	}
	
	
	
	public static void failSort(int [][] array) {
		for(int row = 0; row < array.length; row++) {
			for(int i = row; i < array.length; i++ ) {
				if(array[row][0] > array[i][0] ) {
					swap(array, row, i);
				}
				
				if (array[row][0] == array[i][0] && array[row][1] > array[i][1]) {
					swap(array, row, i);
				}
				
			}
		}
	}
	
	public static void swap(int [][] array, int idx1, int idx2) {
		int [] temp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = temp;
	}
	
	public static void printArray(int [][] array) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < array.length; i ++) {
			sb.append(array[i][0] +" "+ array[i][1] +"\n");
		}
		System.out.println(sb);
	}

}
