package study.structure.stack;

import java.util.Stack;

/**
 * Description :  �ڷᱸ�� ����.<br>
 * Date : 2021. 8. 31.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 8. 31., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class StructureStack {
	
	public static void main(String [] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for( int i = 1 ; i < 5 ; i ++) {
			System.out.println("push : " + i);
			stack.push(i);
		}
		
		while(stack.iterator().hasNext()) {
			System.out.println("pop : " + stack.pop());
		}
	}
	
	
}
