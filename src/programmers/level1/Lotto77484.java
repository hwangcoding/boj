package programmers.level1;

/**
 * Description : �ζ��� �ְ� ������ ���� ����<br>
 * Date : 2021. 8. 30.<br>
 * History :<br>
 * - �ۼ��� : Hman, ��¥ : 2021. 8. 30., ���� : �����ۼ�<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Lotto77484 {

	
	public static void main(String [] args) {
		int [] lottos = new int [6];
		int [] winNumber = new int [6];
		
		System.out.println(solution(lottos, winNumber));
	}
	
	public static int [] resultArray() {
		int [] array = new int [6];
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		return array;
	}
	
	public static int [] solution(int [] lottos, int [] winNumber)  {
		int zeroCount = 0, checkCount = 0;
		int [] result = resultArray();
		// ��÷ ��ȣ ����
		for( int i = 0 ; i < lottos.length; i++) {
			if( lottos[i] == 0 ) {
				zeroCount++;
			}else {
				// ��÷ ��ȣ ����
				for(int j = 0 ; j < lottos.length; j++) {
					if( lottos[i] == winNumber[j]) {
						checkCount++;
					}
				}
			}
		}
		if(checkCount == 0) {
			if(checkCount+zeroCount == 0) 
				return new int[]{result[5], result[5]};
			return new int[]{result[6- (checkCount+zeroCount)], result[5]};
		}else {
			return new int[]{result[6- (checkCount+zeroCount)], result[6- (checkCount)]};
		}
	}
}
