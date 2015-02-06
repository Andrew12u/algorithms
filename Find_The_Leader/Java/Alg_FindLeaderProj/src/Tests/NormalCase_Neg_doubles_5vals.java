package Tests;
import org.junit.Test;
import static org.junit.Assert.assertNull;
import Algorithms.*;

public class NormalCase_Neg_doubles_5vals {
	@Test
	public void testAdd(){
		Double[] m_testArr = {0.0,1.25,3.25,4.25,5.25};
		System.out.println("NormalCase_Neg_doubles_5vals : Testing with array {0.0,1.25,3.25,4.25,5.25}. There should be no leader.");
		Alg_FindLeader<Double> m_testAlg = new Alg_FindLeader<Double>();
		Double   m_returnResult = m_testAlg.findInNTime(m_testArr);
		assertNull(m_returnResult);
	}
}
