package sort.HeapSort.code.heapify;

public class Compare_Time {
	// �����ѵĽ�������ͬ��������Ҫ�ƶ���λ�á�·������ͬ���Ƚ����������ٶ�...���ף����ٶȲ�����һ���ô=_=��
	private static int[] max_heapify_list = { 30, 4, 8, 15, 13, 6, 2, 7, 8, 12,
			11, 4, 5, 1, 0, 4, 2 };
	private static int[] min_heapify_list = { 1, 16, 3, 4, 5, 6, 7, 9, 8, 10,
			11, 12, 13, 14, 15, 16, 17 };

	public static void main(String args[]) {
		int i;
		long startMili;// ��ʼʱ���Ӧ�ĺ�����
		long endMili;// ����ʱ���Ӧ�ĺ�����

		//�ݹ鷽��������
		startMili = System.currentTimeMillis();
		i = 0;
		while (i < 1000000000) {
			MAX_HEAPIFY.HEAPIFY(max_heapify_list, 1);
			i++;
		}
		endMili = System.currentTimeMillis();
		System.out.println("�ݹ�����ִ��1000000000��ʹ��ʱ��:" + " "
				+ (endMili - startMili));

		
		//�ݹ鷽������С��
		 i=0;
		 startMili=System.currentTimeMillis();// ��ǰʱ���Ӧ�ĺ�����
		 while(i<1000000000){
		 MIN_HEAPIFY.HEAPIFY(min_heapify_list, 1);
		 i++;
		 }
		 endMili=System.currentTimeMillis();
		 System.out.println("�ݹ���С��ִ��1000000000��ʹ��ʱ��:"+" "+(endMili-startMili));

		
		
		//�ǵݹ鷽��������
		startMili = System.currentTimeMillis();// ��ǰʱ���Ӧ�ĺ�����
		i = 0;
		while (i < 1000000000) {
			max_heapify_non_Iterator.HEAPIFY(max_heapify_list, 1);
			i++;
		}
		endMili = System.currentTimeMillis();
		System.out.println("�ǵݹ�����ִ��1000000000��ʹ��ʱ��:" + " "
				+ (endMili - startMili));
	}
}
