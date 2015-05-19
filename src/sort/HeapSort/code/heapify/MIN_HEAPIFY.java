package sort.HeapSort.code.heapify;

import static sort.HeapSort.code.CAL_PARENT_CHILDREN.LEFT;
import static sort.HeapSort.code.CAL_PARENT_CHILDREN.RIGHT;

public class MIN_HEAPIFY {
	
	public static int[] HEAPIFY(int[] list , int i){
		 int minority;
		
		int l = LEFT(i);
		int r = RIGHT(i);
		
		//�ҵ�����������±�
		if (l<list.length && list[l]<list[i]) 
			minority = l;
		else 
			minority = i;
		
		if (r<list.length && list[r]<list[minority]) 
			minority = r;
		
		//i������������ģ�����Ҫ����ƽ�⡣
		//i��Ҫ�������ӽ�㽻��λ�ã�������largest��Ϊi��������в���ֱ������ƽ��
		if (minority != i) {
			//����λ��
			int temp = list[minority];
			list[minority] = list[i];
			list[i] = temp;
			
			HEAPIFY(list , minority);
		}
		
		return list;
	}
}
