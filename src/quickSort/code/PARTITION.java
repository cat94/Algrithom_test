package quickSort.code;

import java.util.Random;


/**
 * 对原数组有影响的partition操作
 * @author shen
 *
 */
public class PARTITION {
	public static int partition(int[] list , int start_index,int end_index){
		int change_index = start_index-1;		//这是分片过程中需要进行替换的下标，从start_index-1开始

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
	 * 为了使算法实现随机化，更好地接近平均性能，防止人为导致的最坏情况的出现
	 * 
	 * 但是由于随机数的生成和交换都会产生时间消耗，所以在测试中若待测试的数组过小（20个元素），
	 * 增加随机化的环节会让耗时接近堆排序，而未随机化时花的时间则是堆排序的20%
	 * 
	 * 
	 * 当有一个100000的随机数组时，非Random快排速度与random快排速度相近
	 * 
	 * 当有一个大小为100000的从小到大排列的数组时，递归的非random: stackOverFlow =_=
	 * 当将递归改成尾递归之后，非random:与堆排时间相差不多: 89%  7.672秒与6.86秒
	 * 而random: 0.57%   7.74秒与0.044秒
	 * 
	 * 
	 * 综上，random快排在大数据输入的时候比较适合
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
