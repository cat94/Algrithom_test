package sort.quickSort.code;

public class QuickSort {
	/**
	 * @param list	�����귽��֮��list���Ѿ��ź���
	 * @param p  	��Ƭ��ʼ�������ڵ���ʱ���������������Ӧ����0
	 * @param r	��Ƭ����������ڵ���ʱ���������������Ӧ����length-1
	 * @return
	 */
	public static void quickSort(int[] list,int p,int r){
		if (p<r) {
			int q = PARTITION.random_partition(list, p, r);
			quickSort(list, p, q-1);
			quickSort(list, q+1, r);
		}
	}
	
	public static void quickSort_TailRecursive(int[] list,int p,int r){
		while (p<r) {
			int q=PARTITION.random_partition(list, p, r);
			if ((q-p)<(r-q)) {
				quickSort_TailRecursive(list, p, q-1);
				p = q+1;
			}
			else {
				quickSort_TailRecursive(list, q+1, r);
				r=q-1;
			}
			
		}
	}

}
