package study.sort.selection;

import common.CommonUtil;

/**
 * 선택정렬
 * 2021.08.11
 * @author Hman
 *
 */
public class Main {
	
	public static void main(String[] args) {
		int [] arr1 = {10, 2, 5, 4, 3, 6, 7, 9, 8, 1,10};
		CommonUtil.sort(new SelectionSort(), arr1);
		
		int [] arr2 = {10, 2, 5, 4, 3, 6, 7, 9, 8, 1,10};
		CommonUtil.sort(new SelectionSort(), arr2);
	}
	
	
}
