"""
Problem: Given an array of elements a0,a1,a2,...,an-1
         Determine the element that occurs more than
		 n/2 times
"""
"""
Removal by pairs
"""

def n_FindLeader(A):
	numElems = len(A)
	size     = 0
	for i in range(numElems ):
		if(size == 0):
			size += 1
			value = A[i]
		else:
			if(value != A[i]):
				size -= 1
			else:
				size += 1
	candidate = -1
	if (size > 0):
		candidate = value
	leader = -1
	count = 0
	for j in range(numElems ):
		if(A[j] == candidate):
			count += 1
	if(count > numElems // 2)
		leader = candidate 
	return leader
			