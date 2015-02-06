package Suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import Tests.*;

//JUnit Suite Test
@RunWith(Suite.class)
@Suite.SuiteClasses({ 
   //TestJunit1.class ,TestJunit2.class
	NormalCase_Neg_doubles_5vals.class, 
	NormalCase_Pos_doubles_5vals.class,
	NormalCase_Neg_ints_5vals.class,
	NormalCase_Pos_ints_5vals.class,
	NormalCas_Pos_ints_5val_special.class
})
public class TestSuite_1 {
}
