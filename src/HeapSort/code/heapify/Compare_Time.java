package HeapSort.code.heapify;

public class Compare_Time {
	// 两个堆的结点个数相同，并且需要移动的位置、路径都相同，比较两方法的速度...（咦，这速度不就是一样的么=_=）
	private static int[] max_heapify_list = { 30, 4, 8, 15, 13, 6, 2, 7, 8, 12,
			11, 4, 5, 1, 0, 4, 2 };
	private static int[] min_heapify_list = { 1, 16, 3, 4, 5, 6, 7, 9, 8, 10,
			11, 12, 13, 14, 15, 16, 17 };

	public static void main(String args[]) {
		int i;
		long startMili;// 开始时间对应的毫秒数
		long endMili;// 结束时间对应的毫秒数

		//递归方法的最大堆
		startMili = System.currentTimeMillis();
		i = 0;
		while (i < 1000000000) {
			MAX_HEAPIFY.HEAPIFY(max_heapify_list, 1);
			i++;
		}
		endMili = System.currentTimeMillis();
		System.out.println("递归最大堆执行1000000000次使用时间:" + " "
				+ (endMili - startMili));

		
		//递归方法的最小堆
		 i=0;
		 startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		 while(i<1000000000){
		 MIN_HEAPIFY.HEAPIFY(min_heapify_list, 1);
		 i++;
		 }
		 endMili=System.currentTimeMillis();
		 System.out.println("递归最小堆执行1000000000次使用时间:"+" "+(endMili-startMili));

		
		
		//非递归方法的最大堆
		startMili = System.currentTimeMillis();// 当前时间对应的毫秒数
		i = 0;
		while (i < 1000000000) {
			max_heapify_non_Iterator.HEAPIFY(max_heapify_list, 1);
			i++;
		}
		endMili = System.currentTimeMillis();
		System.out.println("非递归最大堆执行1000000000次使用时间:" + " "
				+ (endMili - startMili));
	}
}
