package backjoon.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Description : �ڷᱸ�� ���� ���� ���� �ڷᱸ���� �־���. ������ ����<br>
 * Date : 2021. 9. 2.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 9. 2., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Editor1406 {
	
	/**
	 * ù° �ٿ��� �ʱ⿡ �����⿡ �ԷµǾ� �ִ� ���ڿ��� �־�����. �� ���ڿ��� ���̰� N�̰�, ���� �ҹ��ڷθ� �̷���� ������, ���̴�
	 * 100,000�� ���� �ʴ´�. ��° �ٿ��� �Է��� ��ɾ��� ������ ��Ÿ���� ���� M(1 �� M �� 500,000)�� �־�����. ��° �ٺ���
	 * M���� �ٿ� ���� �Է��� ��ɾ ������� �־�����. ��ɾ�� ���� �� ���� �� �ϳ��� ���·θ� �־�����.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		List<Character> list = new LinkedList<Character>();

		String str = br.readLine();
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		
		int cursor = str.length();
		for( int i = 0 ; i < size; i ++) {
			String orders = br.readLine();
			
			switch (orders.charAt(0)) {
				case 'L':  
					if( cursor != 0 ) cursor--;
					break;
				case 'D': 
					if( cursor != list.size() ) cursor++;
					break;
				case 'B':
					if( cursor != 0 ) {
						list.remove(cursor-1);
						cursor--;
					}  
					break;
				case 'P':
						list.add(cursor, orders.charAt(2));
						cursor++;
					break;
			}
		}
		
		for(char a : list) {
			sb.append(a);
		}
		System.out.println(sb);
	}
}
