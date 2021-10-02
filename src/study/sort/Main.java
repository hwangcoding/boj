package study.sort;

import common.CommonUtil;
import study.sort.bubble.BubbleSort;
import study.sort.heap.HeapSort;
import study.sort.insertion.InsertionSort;
import study.sort.merge.MergeSort;
import study.sort.quick.QuickSort;
import study.sort.selection.SelectionSort;

public class Main {

	public static void main(String[] args) {
		int [] ARRAY = CommonUtil.randomArray(100000);
		
		CommonUtil.sort(new SelectionSort(), ARRAY.clone());
		CommonUtil.sort(new BubbleSort(), ARRAY.clone());
		CommonUtil.sort(new InsertionSort(), ARRAY.clone());
		CommonUtil.sort(new QuickSort(), ARRAY.clone());
		CommonUtil.sort(new MergeSort(), ARRAY.clone());
		CommonUtil.sort(new HeapSort(), ARRAY.clone());
		
	}

}
