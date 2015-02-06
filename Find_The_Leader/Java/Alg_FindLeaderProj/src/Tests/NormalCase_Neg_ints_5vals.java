package Tests;
import org.junit.Test;
import static org.junit.Assert.assertNull;
import Algorithms.*;

public class NormalCase_Neg_ints_5vals {
	@Test
	public void testAdd(){
		Integer[] m_testArr = {0,1,2,3,4};
		System.out.println("NormalCase_Neg_ints_5vals : Testing with array {0,1,2,3,4}. Leader should be null.");
		Alg_FindLeader<Integer> m_testAlg = new Alg_FindLeader<Integer>();
		Integer   m_returnResult = m_testAlg.findInNTime(m_testArr);
		assertNull(m_returnResult);
	}
}
