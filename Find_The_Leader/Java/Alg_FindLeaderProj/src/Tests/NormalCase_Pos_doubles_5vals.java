package Tests;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import Algorithms.*;

public class NormalCase_Pos_doubles_5vals {
	@Test
	public void testAdd(){
		Double[] m_testArr = {0.0,1.25,3.25,3.25,3.25};
		System.out.println("NormalCase_Pos_doubles_5vals : Testing with array {0.0,1.25,3.25,3.25,3.25}. Leader should be 3.25.");
		Alg_FindLeader<Double> m_testAlg = new Alg_FindLeader<Double>();
		Double   m_returnResult = m_testAlg.findInNTime(m_testArr);
		assertTrue(m_returnResult.doubleValue()==3.25);
	}
}