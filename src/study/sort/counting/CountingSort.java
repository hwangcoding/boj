package study.sort.counting;

import study.sort.GyubSort;

/**
 * Description : ������� ( Counting sort ) <br>
 * Date : 2021. 8. 25.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 8. 25., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class CountingSort implements GyubSort{

	@Override
	public void sort(int[] array) {
		
	}
	
	public static void sort(int[] array, int condition) {
		int [] count = new int [condition];
		for( int i = 0; i < array.length; i++) {
			if(array[i] -1 < condition) count[array[i] -1 ]++;
		}
		
		for(int j = 0 ; j < condition; j++) {
			
			for( int k = 0; k < count[j]; k++) {
				System.out.print(j+1 + ",");
			}
		}
		
		
	}
}