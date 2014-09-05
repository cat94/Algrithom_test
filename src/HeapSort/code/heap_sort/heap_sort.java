package HeapSort.code.heap_sort;

import HeapSort.code.build_heap.Build_Max_Heap;
import HeapSort.code.heapify.max_heapify_non_Iterator;

/**
 * 建立了最大堆之后，要依从小到大的顺序输出所有数字，只需要将最后一个元素与第0个元素对调，然后数组长度减一
 * 在对调之后需要使用max_heapify来使堆重新平衡
 * 
 * @author shen
 * 
 */
public class heap_sort {
	public static void main(String args[]){
		int[] list = {1,34,45,67,12,15,18,43,23,56,78,23};
		sort(list.clone());
		
		int[] sorted_list = sort(list.clone());		//为了防止原数组被改变，使用深拷贝
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
			
			//由于java中数组无法通过索引来切割数组，所以进行了很费时的数组复制
				clone_list = heaped_list.clone();

				heaped_list = new int[i];
			for(int j=0;j<i;j++){
				heaped_list[j] = clone_list[j];
			}
			
			heaped_list = max_heapify_non_Iterator.HEAPIFY(heaped_list, 0);		//进行调整
			
//			for (int k : heaped_list) {
//				System.out.print(k+" ");
//			}
//			System.out.println();
//			
		}
		
		return sorted_list;
	}

}
