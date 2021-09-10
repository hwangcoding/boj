package backjoon.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Description : ���� 10828 ���ù���<br>
 * Date : 2021. 9. 1.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 9. 1., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Stack10828 {
	static StringBuffer sb = new StringBuffer();
	static Stack<Integer> stack = new Stack<Integer>();
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ��ɾ� ����
		int size = Integer.parseInt(br.readLine());
		
		// ��ɾ� �Է� ó��
		for(int i = 0 ; i < size; i ++) {
			String str = br.readLine();
			order(stack , str);
		}
		
		System.out.println(sb);

	}
	
	
	/**
	 * ��ɾ� �Է� ó��
	 	push X: ���� X�� ���ÿ� �ִ� �����̴�.
		pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
		empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
		top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	 * @param stack
	 * @param order
	 */
	public static void order(Stack<Integer> stack, String order) {
		String [] orders = order.split(" ");
		
		switch (orders[0]) {
		case "push": 
			stack.push(Integer.parseInt(orders[1]));
			break;
		case "pop":
			sb.append(stack.size() == 0 ? "-1" : stack.pop()).append("\n");
			break;
		case "size":
			sb.append(stack.size()).append("\n");
			break;
		case "empty":
			sb.append(stack.size() == 0 ? "1" : "0").append("\n");
			break;	
		case "top":
			sb.append(stack.size() == 0 ? "-1" : stack.lastElement()).append("\n");
			break;	
		}
		
				
	} 

}
