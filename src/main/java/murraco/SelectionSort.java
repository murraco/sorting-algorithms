package murraco;

public class SelectionSort {

  // Time complexity: O(n^2) - Space complexity: O(1)
  public static <T extends Comparable<T>> void selectionSort(T[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int iMin = i;
      for (int j = i + 1; j < arr.length; j++) {
        iMin = (arr[j].compareTo(arr[iMin]) < 0) ? j : iMin;
      }
      swap(arr, i, iMin);
    }
  }

  public static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
    T temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
