package HeapSort.junit;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class Test_Suit {

	@Before
	public void setUp() throws Exception {
	}
	
	// 指定运行器
	@RunWith(Suite.class)
	// 指定要测试的类
	@Suite.SuiteClasses({ MAX_HEAPIFY_TEST.class, MIN_HEAPIFY_TEST.class })
	public class TestAll
	{
	}


}
