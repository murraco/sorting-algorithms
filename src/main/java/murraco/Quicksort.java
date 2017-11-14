package murraco;

public class Quicksort {

  // Time complexity: average O(n*log(n)) and worst O(n^2) - Space complexity: O(log(n))
  public static <T extends Comparable<T>> void quickSort(T[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  public static <T extends Comparable<T>> void quickSort(T[] arr, int start, int end) {
    if (start < end) {
      int pivotIndex = partition(arr, start, end);
      quickSort(arr, start, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, end);
    }
  }

  public static <T extends Comparable<T>> int partition(T[] arr, int start, int end) {
    int pivotIndex = pickPivotIndex(start, end);
    T pivot = arr[pivotIndex];
    swap(arr, pivotIndex, end);
    int index = start;
    for (int i = start; i < end; i++) {
      if (arr[i].compareTo(pivot) < 0) {
        swap(arr, i, index);
        index++;
      }
    }
    swap(arr, index, end);
    return index;
  }

  public static int pickPivotIndex(int start, int end) {
    return (int) (start + (end - start + 1) * Math.random());
  }

  public static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
    T temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
