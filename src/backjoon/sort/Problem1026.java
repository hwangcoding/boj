package backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Description : ���� ã�� 1026<br>
 * Date : 2021. 9. 4.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 9. 4., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Problem1026 {

	/**
	 * ù° �ٿ� N�� �־�����. 
	 * ��° �ٿ��� A�� �ִ� N���� ���� ������� �־�����, 
	 * ��° �ٿ��� B�� �ִ� ���� ������� �־�����. N��
	 * 50���� �۰ų� ���� �ڿ����̰�, A�� B�� �� ���Ҵ� 100���� �۰ų� ���� ���� �ƴ� �����̴�.
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		int [] x = new int[size];
		int [] y = new int[size];
		int [] temp = new int[size];
		boolean [] check = new boolean[size];
		int sum = 0 ;
		String [] str1 = br.readLine().split(" ");
		String [] str2 = br.readLine().split(" ");
		
		for(int i = 0 ; i < size; i++ ) {
			x[i] = Integer.parseInt(str1[i]);
			y[i] = Integer.parseInt(str2[i]);
		}
		
		// ù���� �迭 ����
		Arrays.sort(x);
		
		for(int i = size-1 ; i > -1; i --) {
			int min = 10001;
			int minKey = -1;
			for(int j = 0; j < size; j++) {
				
				if(!check[j] && min > x[i] * y[j]) {
					min = x[i] * y[j];
					minKey = j;
				}
			}
			check[minKey] = true;
			temp[minKey] = x[i];
		}
		
		for(int i = 0 ; i < size; i ++ ) {
			sum += temp[i] * y[i];
		}
		System.out.println(sum);
		
	}

}

