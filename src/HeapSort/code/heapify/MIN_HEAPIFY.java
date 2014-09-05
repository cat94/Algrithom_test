package HeapSort.code.heapify;

import static HeapSort.code.CAL_PARENT_CHILDREN.LEFT;
import static HeapSort.code.CAL_PARENT_CHILDREN.RIGHT;

public class MIN_HEAPIFY {
	
	public static int[] HEAPIFY(int[] list , int i){
		 int minority;
		
		int l = LEFT(i);
		int r = RIGHT(i);
		
		//找到三个中最大的下标
		if (l<list.length && list[l]<list[i]) 
			minority = l;
		else 
			minority = i;
		
		if (r<list.length && list[r]<list[minority]) 
			minority = r;
		
		//i不是三个中最大的，则需要进行平衡。
		//i需要和最大的子结点交换位置，交换后largest处为i，继续进行操作直到最终平衡
		if (minority != i) {
			//交换位置
			int temp = list[minority];
			list[minority] = list[i];
			list[i] = temp;
			
			HEAPIFY(list , minority);
		}
		
		return list;
	}
}
