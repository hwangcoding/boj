package programmers.level1;

/**
 * Description : īī�� ä�뿬���� ���Ͻ� , ���� ���ڿ��� ���ܾ�.<br>
 * Date : 2021. 8. 31.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 8. 31., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class NumberString81301 {
	final static String [] word = getWord();
	
	public static void main(String[] args) {
		String str = "one4seveneight";
		solution(str);
	}
	
	public static int solution(String str) {
		for(int i = 0 ; i < word.length; i++) {
			str = str.replaceAll(word[i], ""+i);
		}
		System.out.println(str);
		return Integer.parseInt(str);
	}
	
	/**
	 * ���ܾ� �迭 ��ȯ
	 * @return String [] 
	 */
	public static String [] getWord() {
		return new String []{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	}

}
