package quickSort.code;

public class QuickSort {
	/**
	 * @param list	调用完方法之后list即已经排好序
	 * @param p  	分片开始的索引，在调用时若对整个数组排序应该是0
	 * @param r	分片结束的索引，在调用时若对整个数组排序应该是length-1
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
