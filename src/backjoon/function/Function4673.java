package backjoon.function;

/**
 * Description : ���� �����ѹ� �Լ� ����.<br>
 * Date : 2021. 8. 26.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 8. 26., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Function4673 {

	// ���� �ѹ��� 1949�� �ε� ������ D.R. Kaprekar�� �̸� �ٿ���. ���� ���� n�� ���ؼ� d(n)�� n�� n�� �� �ڸ����� ���ϴ� �Լ���� ��������. ���� ���, d(75) = 75+7+5 = 87�̴�.
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		boolean [] check = new boolean[10001] ;
		
		for( int k = 0; k < check.length; k++) {
			if(d(k) < 10001) {
				check[d(k)] = true;
			}
		}
		
		for( int k = 1; k < check.length; k++) {
			if(!check[k]) sb.append(k).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void test(boolean [] check) {
		for( int k = 0; k < check.length; k++) {
			if(d(k) < 10001) {
				check[d(k)] = true;
				System.out.println(k);
			}
		}
	}
	
	public static void test2(boolean [] check) {
		int i = 1 ;
		while(d(i) < 10001) {
			System.out.println(i);
			check[d(i)] = true;
			i++;
		}
	}
	
	
	public static int d(int num) {
		int sum = num;
		
		while( num != 0) {
			sum = sum + (num%10);
			num = num/10;
		}
		
		return sum;
	}

}
