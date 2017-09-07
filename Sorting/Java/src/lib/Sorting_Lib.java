public class Sorting_Lib {
  public static int[] insertionSort(int[] listToSort){
    int[] A = listToSort;
    int i = 1;
    while(i < A.length){
      int x = A[i];
      int j = i - 1;
      while((j >= 0) && (A[j] > x)){
        A[j+1] = A[j];
        j = j - 1;
      }
      A[j+1] = x;
      i = i + 1;
    }
    return A;
  }
}
