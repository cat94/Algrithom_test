package HeapSort.code.build_heap;

import static HeapSort.code.heapify.MAX_HEAPIFY.HEAPIFY;;

public class Build_Max_Heap {

	public static int[] build(int[] list) {
		// 从第二层开始使用max_heapify算法，由于java的list从0开始计数，所以在floor的基础上减一
		int start_index = (int) Math.floor(list.length / 2) - 1;
		if (start_index >= 0) {
			for (int i = start_index; i >= 0; i--) {
				list = HEAPIFY(list,i);
			}
		} 
		
		return list;
	}
}
