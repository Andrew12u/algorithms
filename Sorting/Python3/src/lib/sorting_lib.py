import sys
"""
A note about python module naming conventions:
https://www.python.org/dev/peps/pep-0008/#package-and-module-names
"""



def insertionSort(listToSort):
    A = listToSort
    i = 1
    while i < len(A) :
        x = A[i]
        j = i - 1
        while j >= 0 and A[j] > x :
            A[j + 1] = A[j]
            j = j - 1
        A[j + 1] = x
        i = i + 1
    return A



if __name__ == "__main__":
    print insertionSort([5,1,6])
