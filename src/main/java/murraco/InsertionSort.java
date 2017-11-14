package murraco;

public class InsertionSort {

  // Time complexity: average O(n^2) and best O(n) - Space complexity: O(1)
  public static <T extends Comparable<T>> void insertionSort(T[] arr) {
    for (int i = 0; i < arr.length; i++) {
      T temp = arr[i];
      int j = i;
      while (j > 0 && arr[j - 1].compareTo(temp) > 0) {
        arr[j] = arr[j - 1];
        j--;
      }
      arr[j] = temp;
    }
  }

}
