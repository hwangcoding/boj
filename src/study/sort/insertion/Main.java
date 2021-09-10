package study.sort.insertion;

import common.CommonUtil;
import study.sort.merge.MergeSort;

public class Main {

	public static void main(String[] args) {
		int [] arr1 = {10, 2, 5, 4, 3, 6, 7, 9, 8, 1,10};
		CommonUtil.sort(new InsertionSort(), arr1);
	}
	
	
	

}
