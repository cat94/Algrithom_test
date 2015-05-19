package sort.HeapSort.code;


/**
 * ������е�parent��children
 * ����java��list��0��ʼ�����Զ����±�Ҫ����һ���ļӼ�1����
 * @author shen
 *
 */
public class CAL_PARENT_CHILDREN {
	public static int LEFT(int i){
		return 2*(i+1)-1;
	}
	public static int RIGHT(int i){
		return 2*(i+1);
	}
	public static int PARENT(int i){
		return (int)Math.floor((i+1)/2)-1;
	}
}
