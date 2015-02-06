package Tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import Algorithms.*;

public class NormalCas_Pos_ints_5val_special {
	@Test
	public void testAdd(){
		Integer[] m_testArr = {3,3,3,3,1,2,2,3,2};
		System.out.println("NormalCase_Pos_ints_5vals : Testing with array {3,3,3,3,1,2,2,3,2}. Leader should be 3.");
		Alg_FindLeader<Integer> m_testAlg = new Alg_FindLeader<Integer>();
		Integer   m_returnResult = m_testAlg.findInNTime(m_testArr);
		assertEquals(m_returnResult.intValue(),3);
	}
}
