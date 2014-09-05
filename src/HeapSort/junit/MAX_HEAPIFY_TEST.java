package HeapSort.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//import static HeapSort.code.heapify.MAX_HEAPIFY.HEAPIFY;
import static HeapSort.code.heapify.max_heapify_non_Iterator.HEAPIFY;

@RunWith(value = Parameterized.class)
public class MAX_HEAPIFY_TEST {

	private int[][] heapify_input = {
			{16,4,10,14,7,9,3,2,8,1},
			{30,4,8,15,13,6,2,7,8,12,11,4,5,1,0,4,2},
			{12,39,45,18,23,2,25,12,17,1,19 }
	};
	
	private int[][] heapify_expected = {
			{16,14,10,8,7,9,3,2,4,1},
			{30,15,8,8,13,6,2,7,4,12,11,4,5,1,0,4,2},
			{45,39,25,18,23,2,12,12,17,1,19} 
	};
	
	private int input_index;
	private int expected_index;
	private int location;
	
	/**
	 * @param input_index 输入的数组在input中的下标
	 * @param location 不平衡的下标
	 * @param expected_index 预期的数组在expected中的下标
	 */
	public MAX_HEAPIFY_TEST(int input_index , int location ,  int expected_index){
		this.input_index = input_index;
		this.location = location;
		this.expected_index = expected_index;
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Parameters
    public static Iterable<Object[]> max_heapify_data() {  
    	int row = 3;
    	Object[][] objects = new Object[row][3];
    	
    	for (int i = 0; i < row; i++) {
			objects[i][0] = i;
			objects[i][2] = i;
		}
    	objects[0][1] = 1;		//不平衡的点所在的位置
    	objects[1][1] = 1;	
    	objects[2][1] = 0;
    	
        return Arrays.asList(objects); // 将数组转换成集合返回
    }  
    
	@Test
	public void test_MAX_HEAPIFY() {
		int[] list = HEAPIFY(heapify_input[input_index],location);
		for (int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		assertArrayEquals(heapify_expected[expected_index], HEAPIFY(heapify_input[input_index],location));  
	}
	
}
