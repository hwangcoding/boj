package study.sort.bubble;

import common.CommonUtil;
import study.sort.heap.HeapSortFail;

public class Main {

	public static void main(String [] args) {
		int [] arr1 = {10, 2, 5, 4, 3, 6, 7, 9, 8, 1,10};
		CommonUtil.sort(new BubbleSort(), arr1);
	}
	
	
	
}
