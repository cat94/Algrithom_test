package sort.HeapSort.code.heap_sort;

import sort.HeapSort.code.build_heap.Build_Max_Heap;
import sort.HeapSort.code.heapify.max_heapify_non_Iterator;

/**
 * ����������֮��Ҫ����С�����˳������������֣�ֻ��Ҫ�����һ��Ԫ�����0��Ԫ�ضԵ���Ȼ�����鳤�ȼ�һ
 * �ڶԵ�֮����Ҫʹ��max_heapify��ʹ������ƽ��
 * 
 * @author shen
 * 
 */
public class heap_sort {
	public static void main(String args[]){
		int[] list = {1,34,45,67,12,15,18,43,23,56,78,23};
		sort(list.clone());
		
		int[] sorted_list = sort(list.clone());		//Ϊ�˷�ֹԭ���鱻�ı䣬ʹ�����
		for (int i : sorted_list) {
			System.out.print(i+"  ");
		}
	}
	
	public static int[] sort(int[] list){
		int[] sorted_list = new int[list.length];
		int[] clone_list = new int[list.length];
		
		int[] heaped_list = Build_Max_Heap.build(list);
		
		for(int i=heaped_list.length-1;i>=0;i--){
			sorted_list[i]  = heaped_list[0];
			heaped_list[0] = heaped_list[i];
			
			//����java�������޷�ͨ���������и����飬���Խ����˺ܷ�ʱ�����鸴��
				clone_list = heaped_list.clone();

				heaped_list = new int[i];
			for(int j=0;j<i;j++){
				heaped_list[j] = clone_list[j];
			}
			
			heaped_list = max_heapify_non_Iterator.HEAPIFY(heaped_list, 0);		//���е���
			
//			for (int k : heaped_list) {
//				System.out.print(k+" ");
//			}
//			System.out.println();
//			
		}
		
		return sorted_list;
	}

}
