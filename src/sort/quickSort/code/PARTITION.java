package sort.quickSort.code;


/**
 * ��ԭ������Ӱ���partition����
 * @author shen
 *
 */
public class PARTITION {
	public static int partition(int[] list , int start_index,int end_index){
		int change_index = start_index-1;		//���Ƿ�Ƭ�������Ҫ�����滻���±꣬��start_index-1��ʼ

		for (int i = start_index; i < end_index; i++) {
			if (list[i]<list[end_index]) {
				change_index++;
				
				int temp = list[i];
				list[i] = list[change_index];
				list[change_index] = temp;
			}
		}
		
		int temp = list[change_index+1];
		list[change_index+1] = list[end_index];
		list[end_index] = temp;
		
		return change_index+1;
	}
	
	/**
	 * Ϊ��ʹ�㷨ʵ�������õؽӽ�ƽ�����ܣ���ֹ��Ϊ���µ������ĳ���
	 * 
	 * ����������������ɺͽ����������ʱ����ģ������ڲ�����������Ե������С��20��Ԫ�أ���
	 * �������Ļ��ڻ��ú�ʱ�ӽ�����򣬶�δ���ʱ����ʱ�����Ƕ������20%
	 * 
	 * 
	 * ����һ��100000���������ʱ����Random�����ٶ���random�����ٶ����
	 * 
	 * ����һ����СΪ100000�Ĵ�С�������е�����ʱ���ݹ�ķ�random: stackOverFlow =_=
	 * �����ݹ�ĳ�β�ݹ�֮�󣬷�random:�����ʱ������: 89%  7.672����6.86��
	 * ��random: 0.57%   7.74����0.044��
	 * 
	 * 
	 * ���ϣ�random�����ڴ���������ʱ��Ƚ��ʺ�
	 * 
	 * @param list
	 * @param start_index
	 * @param end_index
	 * @return
	 */
	public static int random_partition(int[] list , int start_index,int end_index){
		int i = (int)Math.round((Math.random()*(end_index-start_index)))+start_index;
		
		int temp = list[i];
		list[i] = list[end_index];
		list[end_index] = temp;
		
		return partition(list, start_index, end_index);
	}
}
