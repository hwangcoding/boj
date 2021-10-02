package study.sort.heap;

import common.CommonUtil;

public class Main {

	public static void main(String[] args) {
		int [] array = {5,4,3,2,1};
		//CommonUtil.sort(new HeapSort(), array);
		CommonUtil.sort(new HeapSort(), array);
		CommonUtil.printArray(array);
	}

}

