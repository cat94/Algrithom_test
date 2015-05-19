package sort.HeapSort.code.build_heap;

import static sort.HeapSort.code.heapify.MAX_HEAPIFY.HEAPIFY;;

public class Build_Max_Heap {

	public static int[] build(int[] list) {
		// �ӵڶ��㿪ʼʹ��max_heapify�㷨������java��list��0��ʼ����������floor�Ļ��ϼ�һ
		int start_index = (int) Math.floor(list.length / 2) - 1;
		if (start_index >= 0) {
			for (int i = start_index; i >= 0; i--) {
				list = HEAPIFY(list,i);
			}
		} 
		
		return list;
	}
}
