package HeapSort.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static HeapSort.code.heapify.MIN_HEAPIFY.HEAPIFY;

@RunWith(value = Parameterized.class)
public class MIN_HEAPIFY_TEST {

	private int[][] heapify_input = {
			{1,16,3,4,5,6,7,8,9,10,11,12,13,14,15,16}
	};
	
	private int[][] heapify_expected = {
			{1,4,3,8,5,6,7,16,9,10,11,12,13,14,15,16}
	};
	
	@Before
	public void setUp() throws Exception {
	}
	
	private int input_index;
	private int expected_index;
	private int location;
	
	/**
	 * @param input_index 输入的数组在input中的下标
	 * @param location 不平衡的下标
	 * @param expected_index 预期的数组在expected中的下标
	 */
	public MIN_HEAPIFY_TEST(int input_index , int location ,  int expected_index){
		this.input_index = input_index;
		this.location = location;
		this.expected_index = expected_index;
	}
	
	@Parameters
    public static Iterable<Object[]> min_heapify_data() {  
    	int row = 1;
    	Object[][] objects = new Object[row][3];
    	
    	for (int i = 0; i < row; i++) {
			objects[i][0] = i;
			objects[i][2] = i;
		}
    	objects[0][1] = 1;		//不平衡的点所在的位置
    	
        return Arrays.asList(objects); // 将数组转换成集合返回
    }  

    @Test
    public void test_HEAPIFY(){
    	int[] list = HEAPIFY(heapify_input[input_index],location);
		for (int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		assertArrayEquals(heapify_expected[expected_index], HEAPIFY(heapify_input[input_index],location));  
    }

}
