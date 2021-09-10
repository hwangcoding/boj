package backjoon.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Description : ����. ť ���� ����.<br>
 * Date : 2021. 9. 2.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 9. 2., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Queue10845 {
	static List<Integer> queue = new ArrayList<Integer>();
	static StringBuffer sb = new StringBuffer();

	/**
	 * push X: ���� X�� ť�� �ִ� �����̴�.
		pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		size: ť�� ����ִ� ������ ������ ����Ѵ�.
		empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
		front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int orderSize = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < orderSize; i++) {
			order(br.readLine().split(" "));
		}
		System.out.println(sb);
	}
	
	public static void order(String [] command) throws InterruptedException {
		
		switch (command[0]) {
		case "push":
			queue.add(Integer.parseInt(command[1]));
			break;
		case "pop":
			sb.append(queue.isEmpty() ? "-1" : queue.remove(0)).append("\n");
			break;
		case "size":
			sb.append(queue.size()).append("\n");
			break;
		case "empty":
			sb.append(queue.isEmpty() ? "1" : "0").append("\n");
			break;
		case "front":
			sb.append(queue.isEmpty() ? "-1" : queue.get(0)).append("\n");
			break;
		case "back":
			sb.append(queue.isEmpty() ? "-1" : queue.get(queue.size()-1)).append("\n");
			break;
		}
	}

	
	
}
