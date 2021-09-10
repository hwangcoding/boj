package backjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Description :  ����. ���ڿ� ��ȭ����.<br>
 * Date : 2021. 8. 28.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 8. 28., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Sort1431 {
	/**
	 * ��� �ø��� ��ȣ�� ���ĺ� �빮�� (A-Z)�� ���� (0-9)�� �̷���� �ִ�.

		�ø����ȣ A�� �ø����ȣ B�� �տ� ���� ���� ������ ����.
		
		A�� B�� ���̰� �ٸ���, ª�� ���� ���� �´�.
		���� ���� ���̰� ���ٸ�, A�� ��� �ڸ����� �հ� B�� ��� �ڸ����� ���� ���ؼ� ���� ���� ������ ���� �����´�. (������ �͸� ���Ѵ�)
		���� 1,2�� �� �������ε� ���� �� ������, ���������� ���Ѵ�. ���ڰ� ���ĺ����� ���������� �۴�.
	*/
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb = new StringBuffer();
			
			
			int size = Integer.parseInt(br.readLine());
			String [] array = new String[size];
			
			for(int i = 0 ; i < size; i ++) {
				array[i] = br.readLine();
			}
			
			Arrays.sort(array , new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					if( o1.length() == o2.length()) {
						int result = sum(o1) - sum(o2);
						return result == 0 ? o1.compareTo(o2) : result;  
					}
					return o1.length() - o2.length();
				}
			});
			
			for( int i = 0; i < size; i++) {
				sb.append(array[i]).append("\n");
			}
			System.out.println(sb);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static int sum(String str) {
		int sum = 0;
		for(int i = 0 ; i < str.length(); i++) {
			if( str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				sum += str.charAt(i) - '0';
			}
		}
		return sum;
	}

	public static int sum(int num) {
		
		int sum = 0 ;
		while(num != 0) {
			sum += (num%10);
			num = num/10;
		}
		return sum;
	}

}
