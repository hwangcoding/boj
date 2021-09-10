package backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Description : Ŭ������ ���� ������ �Է����ּ���.<br>
 * Date : 2021. 8. 26.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 8. 26., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Sort10814 {

	public static void main(String[] args) {
		// ù° �ٺ��� �� N���� �ٿ� ���� �¶��� ���� ȸ���� ���� ��, ���̰� ������ ������ ������ �� �ٿ� �� �� ���̿� �̸��� �������� ������ ����Ѵ�.
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb = new StringBuffer();
			
			int size = Integer.parseInt(br.readLine());
			String [][] array = new String [size][2];
			
			
			for(int i = 0 ; i < size; i++) {
				array[i] = br.readLine().split(" ");
			}
			
			Arrays.sort(array, new Comparator<String[]>() {
				@Override
				public int compare(String[] o1, String[] o2) {
					int m	 = Integer.parseInt(o1[0]);
					int k = Integer.parseInt(o2[0]);
					
					if(m > k ) return 1;
					else if(m == k ) return 0;
					else return -1;
				}
			});
			
			for(int i = 0 ; i < size; i++) {
				sb.append(array[i][0]).append( " ").append(array[i][1]).append("\n");
			}
			
			System.out.println(sb);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
