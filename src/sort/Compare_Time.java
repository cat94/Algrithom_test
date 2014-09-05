package sort;

import java.awt.List;

import quickSort.code.QuickSort;
import HeapSort.code.heap_sort.heap_sort;
import HeapSort.code.heapify.MAX_HEAPIFY;
import HeapSort.code.heapify.MIN_HEAPIFY;
import HeapSort.code.heapify.max_heapify_non_Iterator;

public class Compare_Time {
	// �����ѵĽ�������ͬ��������Ҫ�ƶ���λ�á�·������ͬ���Ƚ����������ٶ�...���ף����ٶȲ�����һ����ô=_=��
//	private static int[] list_to_sort = { 45, 15, 10, 4, 6, 14, 2, 7, 8, 12,
//			11, 13, 0, 1, 4, 9, 2 };
	private static int[] list_to_sort = new int[100000];
	
	public static void main(String args[]) {
		int i;
		long startMili;// ��ʼʱ���Ӧ�ĺ�����
		long endMili;// ����ʱ���Ӧ�ĺ�����
		
		
		for(int j=0;j<100000;j++){
			list_to_sort[j] = (int)Math.floor(Math.random()*100000);
//			list_to_sort[j] = j;
		}

		//������
		startMili = System.currentTimeMillis();
		i = 0;
		while (i < 1) {
			int[] list = list_to_sort.clone();
			heap_sort.sort(list);
			i++;
		}
		endMili = System.currentTimeMillis();
		System.out.println("����ִ��1������ʹ��ʱ��:" + " "
				+ (endMili - startMili));
			
			
			//����
			startMili = System.currentTimeMillis();// ��ǰʱ���Ӧ�ĺ�����
			i = 0;
			while (i < 1) {
				int[] list = list_to_sort.clone();
				QuickSort.quickSort_TailRecursive(list, 0,list_to_sort.length-1);
				i++;
			}
			endMili = System.currentTimeMillis();
			System.out.println("����ִ��1������ʹ��ʱ��:" + " "
					+ (endMili - startMili));
			
	}
}
