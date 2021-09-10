package fullsearch.baseball;

import java.util.ArrayList;
import java.util.List;

/**
 * ���� �߱� �˰���
 * @author Gyub
 *
 */

/*
 * ������ ������ ���� 3�ڸ��� ���ߴ� ���� 
 * ���� ������ ���� 3�ڸ��� ���Ѵ� ( 123 , 346)
 * �������� ���� �����ư��� ������ ���ڸ� �����ϸ� ������ ����
 * 
 * 3�ڸ��� ���ڸ� ��ģ��
 * ��ģ ������ ���ڴ� ������, �ڸ����� ��ġ�� �ٸ��� ��
 * ���ڿ� ��ġ�� �� ������ ��Ʈ����ũ
 * ���ڰ� �ٸ��� �ƿ�
 * 
 * */

public class BaseBall {

	List candidates = new ArrayList();
	
	BaseBall(){
		// �����ڸ�
		for(int hundredsIDX = 1; hundredsIDX <= 9; hundredsIDX++) {
			
			// �����ڸ�
			for(int tensIDX = 1; tensIDX<= 9;tensIDX++) {
				if( tensIDX != hundredsIDX ) {
					// �����ڸ�
					for(int onesIDX = 1; onesIDX <= 9; onesIDX++) {
						if( onesIDX != tensIDX && onesIDX != hundredsIDX) {
							String str = String.valueOf(hundredsIDX) + String.valueOf(tensIDX) + String.valueOf(onesIDX);
							this.candidates.add(str);
						}
					}
				}
			}
		}
		
	}
	
	
	
	public List getCandidates(String number, int strike, int ball) {
		List newCandidates = new ArrayList();
		String str[] = number.split("");
		
		int size = candidates.size();
		if (ball == 1) {
			for( int candidateIDX = 0 ; candidateIDX < size; candidateIDX++) {
				if (str[2].equals(candidates.get(candidateIDX).toString().substring(0,1)) ) {
					newCandidates.add(candidates.get(candidateIDX).toString());
				}
				if (str[1].equals(candidates.get(candidateIDX).toString().substring(0,1)) ) {
					newCandidates.add(candidates.get(candidateIDX).toString());
				}
			}
		}
		
		
		return newCandidates;
	}



	public List getCandidates() {
		return candidates;
	}



	public void setCandidates(List candidates) {
		this.candidates = candidates;
	}
	
	
	
}
