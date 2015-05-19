package sort.HeapSort.code.heapify;

import static sort.HeapSort.code.CAL_PARENT_CHILDREN.*;

public class MAX_HEAPIFY {
	
	public static int[] HEAPIFY(int[] list , int i){
		
		int largest;
		
		int l = LEFT(i);
		int r = RIGHT(i);
		
		//�ҵ�����������±�
		if (l<list.length && list[l]>list[i]) 
			largest = l;
		else 
			largest = i;
		
		if (r<list.length && list[r]>list[largest]) 
			largest = r;
		
		//i������������ģ�����Ҫ����ƽ�⡣
		//i��Ҫ�������ӽ�㽻��λ�ã�������largest��Ϊi��������в���ֱ������ƽ��
		if (largest != i) {
			//����λ��
			int temp = list[largest];
			list[largest] = list[i];
			list[i] = temp;
			
			HEAPIFY(list , largest);
		}
		
		return list;
	}
}
