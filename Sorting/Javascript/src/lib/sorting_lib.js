export function insertionSort(listToSort){
  let A = listToSort;
  let i = 0;
  while(i < A.length){
    let x = A[i];
    let j = i - 1;
    while((j >= 0) && (A[j] > x)){
      A[j + 1] = A[j];
      j = j - 1;
    }
    A[j + 1] = x;
    i = i + 1;
  }
  return A;
}
