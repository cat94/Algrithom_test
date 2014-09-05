package HeapSort.code.heapify;

import static HeapSort.code.CAL_PARENT_CHILDREN.LEFT;
import static HeapSort.code.CAL_PARENT_CHILDREN.RIGHT;

/**
 * 递归在某些编译器中可能产生低效的代码，所以将其改写成非递归的方法
 * 
 * @author shen
 * 
 */
public class max_heapify_non_Iterator {
	public static int[] HEAPIFY(int[] list, int i) {
		int largest = -1; // 赋初值为-1，以适应while第一次比较

		while (true) {
			int l = LEFT(i);
			int r = RIGHT(i);

			// 找到三个中最大的下标
			if (l < list.length && list[l] > list[i])
				largest = l;
			else
				largest = i;

			if (r < list.length && list[r] > list[largest])
				largest = r;

			// i不是三个中最大的，则需要进行平衡。
			// i需要和最大的子结点交换位置，交换后largest处为i，继续进行操作直到最终平衡
			if (largest != i) {
				// 交换位置
				int temp = list[largest];
				list[largest] = list[i];
				list[i] = temp;

				i = largest; // 下一个循环中i即为largest的位置了
			}
			else {
				break;
			}
		}

		return list;
	}
}
