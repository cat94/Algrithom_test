package sort.HeapSort.code.heapify;

import static sort.HeapSort.code.CAL_PARENT_CHILDREN.LEFT;
import static sort.HeapSort.code.CAL_PARENT_CHILDREN.RIGHT;

/**
 * �ݹ���ĳЩ�������п��ܲ����Ч�Ĵ��룬���Խ����д�ɷǵݹ�ķ���
 * 
 * @author shen
 * 
 */
public class max_heapify_non_Iterator {
	public static int[] HEAPIFY(int[] list, int i) {
		int largest = -1; // ����ֵΪ-1������Ӧwhile��һ�αȽ�

		while (true) {
			int l = LEFT(i);
			int r = RIGHT(i);

			// �ҵ�����������±�
			if (l < list.length && list[l] > list[i])
				largest = l;
			else
				largest = i;

			if (r < list.length && list[r] > list[largest])
				largest = r;

			// i������������ģ�����Ҫ����ƽ�⡣
			// i��Ҫ�������ӽ�㽻��λ�ã�������largest��Ϊi��������в���ֱ������ƽ��
			if (largest != i) {
				// ����λ��
				int temp = list[largest];
				list[largest] = list[i];
				list[i] = temp;

				i = largest; // ��һ��ѭ����i��Ϊlargest��λ����
			}
			else {
				break;
			}
		}

		return list;
	}
}
