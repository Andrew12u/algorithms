package Algorithms;
/**
 *  Summary : A class which holds algorithms which solve the following situation/problem
 *            Given: an array A of integers, consisting of n elements
 *            Find : the element that occurs more than n/2 times
 */
public class Alg_FindLeader<E> {
    /**
     * An algorithm for finding the leader in O(n) time. Relies upon the observation that
     * removal of pairs of elements in an array does not impact the return leader result.
     * @param me_inputArray an integer argument.
     * @return null if there is no leader, or leader.
     */
	public E findInNTime(E[] me_inputArray){
		final int me_numOfElems = me_inputArray.length;  /**< final int me_numOfElems. The number of elements in the input array */ 
		int       me_size       = 0;                     /**< int me_size. The number of consecutive similar numbers */
		E         me_value      = null;                  /**< E me_value. The value of the current array elem as we iterate */
		E         me_candidate  = null;                  /**< E me_candidate. Candidate for the leader */
		E         me_leader     = null;                  /**< E me_leader. element in array that occurs more than n/2 times.*/
		int       me_count      = 0;                     /**< int me_count. The number of times that a candidate occurs in input array. */
		
		/**
		 * Iterate through the array.  If two consecutive elements are similar then increase me_size.
		 * me_value resets each time me_size goes to 0.
		 * Note: If there are an even number of alternating elements, such as 0,4,0,4,0,4, 
		 *       By necessity, none of the elements can occur more than n/2 times.
		 * Note: If here are an odd number of alternating elements, such as 0,4,0,4,0
		 *       The *last* value, out of neccessity, must occur more than n/2 times.
		 */
		for(int i=0; i<me_numOfElems; i++){
			if(me_size == 0){
				me_size++;
				me_value = me_inputArray[i];
			}
			else{
				if(me_value != me_inputArray[i]) 
					me_size--;
				else
					me_size++;
			}
		}
		/**
		 * A simple if statement.
		 * Checking to see if there is a potential candidate.  
		 */
		if(me_size > 0)
			me_candidate = me_value;
		
		/**
		 * A simple O(n) forloop
		 * Summing the number of elements in the input array that match the candidate.
		 */
		for(int i=0; i<me_numOfElems; i++){
			if(me_inputArray[i].equals(me_candidate))
				me_count++;
		}
		
		if(me_count > Math.floor(me_numOfElems >> 2)){
			me_leader = me_candidate;
		}
		
		return me_leader;
	}
}
