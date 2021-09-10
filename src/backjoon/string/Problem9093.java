package backjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description : ���ʰ��� 1[ ���ڿ� ������ ]<br>
 * Date : 2021. 9. 10.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 9. 10., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Problem9093 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			String [] strSplit = br.readLine().split(" ");
			for( int j = 0 ; j < strSplit.length; j++) {
				
				for(int k = strSplit[j].length()-1; k > -1; k--) {
					sb.append(strSplit[j].charAt(k));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}