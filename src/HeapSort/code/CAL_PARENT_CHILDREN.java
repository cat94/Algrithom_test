package HeapSort.code;


/**
 * 获得树中的parent和children
 * 由于java中list以0开始，所以对于下标要进行一定的加减1处理
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
