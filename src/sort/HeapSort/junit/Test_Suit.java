package sort.HeapSort.junit;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class Test_Suit {

	@Before
	public void setUp() throws Exception {
	}
	
	// ָ��������
	@RunWith(Suite.class)
	// ָ��Ҫ���Ե���
	@Suite.SuiteClasses({ MAX_HEAPIFY_TEST.class, MIN_HEAPIFY_TEST.class })
	public class TestAll
	{
	}


}
