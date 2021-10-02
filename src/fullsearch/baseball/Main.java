package fullsearch.baseball;

import java.util.ArrayList;
import java.util.List;

/**
 * 2021.05.23
 * @author Hman
 *
 */
public class Main {

	public static void main(String[] args) {
		int number [][] = new int[4][3];
		
		BaseBall baseBall = new BaseBall();
		
		String anwser = "941";
		
		baseBall.setCandidates(baseBall.getCandidates("123", 0, 1));
		System.out.println(baseBall.candidates.size());
		
		baseBall.setCandidates(baseBall.getCandidates("345", 1, 0));
		System.out.println(baseBall.candidates.size());
		
		baseBall.setCandidates(baseBall.getCandidates("367", 0, 0));
		System.out.println(baseBall.candidates.size());
		
		baseBall.setCandidates(baseBall.getCandidates("841", 2, 0));
		System.out.println(baseBall.candidates.size());
		
		
	}
	
}
