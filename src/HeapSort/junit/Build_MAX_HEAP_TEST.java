package HeapSort.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import HeapSort.code.build_heap.Build_Max_Heap;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class Build_MAX_HEAP_TEST {
	
	private int[][] list_input = {
			{14,10,4,2,3,1,7,16,8,9},
			{4,2,13,15,8,6,7,8,2,4,12,11,5,0,1,30,4},
			{12,23,45,12,1,2,25,18,17,39,19}
	};
	
	private int[][] list_expected = {
			{16 ,14 ,7 ,10 ,9 ,1 ,4 ,2 ,8 ,3 },
			{30, 15, 13, 8, 12, 11, 7, 4, 2, 4, 8, 6, 5, 0, 1, 2, 4},
			{45,39, 25, 18, 23, 2 ,12, 12, 17, 1, 19 } 
	};
	
	private int input_index;
	private int expected_index;
	
	/**
	 * @param input_index 输入的数组在input中的下标
	 * @param expected_index 预期的数组在expected中的下标
	 */
	public Build_MAX_HEAP_TEST(int input_index ,  int expected_index){
		this.input_index = input_index;
		this.expected_index = expected_index;
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Parameters
    public static Iterable<Object[]> max_heapify_data() {  
    	int row = 3;
    	Object[][] objects = new Object[row][2];
    	
    	for (int i = 0; i < row; i++) {
			objects[i][0] = i;
			objects[i][1] = i;
		}
    	
        return Arrays.asList(objects); // 将数组转换成集合返回
    }  
    
	@Test
	public void test_Build() {
		int[] list = Build_Max_Heap.build(list_input[input_index]);
		for (int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		assertArrayEquals(list_expected[expected_index], Build_Max_Heap.build(list_input[input_index]));  
	}

}
