package Tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import Algorithms.*;

public class NormalCase_Pos_ints_5vals {
	@Test
	public void testAdd(){
		Integer[] m_testArr = {0,1,3,3,3};
		System.out.println("NormalCase_Pos_ints_5vals : Testing with array {0,1,3,3,3}. Leader should be 3.");
		Alg_FindLeader<Integer> m_testAlg = new Alg_FindLeader<Integer>();
		Integer   m_returnResult = m_testAlg.findInNTime(m_testArr);
		assertEquals(m_returnResult.intValue(),3);
	}
}
