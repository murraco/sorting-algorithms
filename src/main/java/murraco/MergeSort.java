package murraco;

public class MergeSort {

  // Time complexity: O(n*log(n)) - Space complexity: O(n)
  public static void mergeSort(Integer[] arr) {
    if (arr.length <= 1) {
      return;
    }
    int mid = arr.length / 2;
    Integer[] left = new Integer[mid];
    Integer[] right = new Integer[arr.length - mid];
    for (int i = 0; i < mid; i++) {
      left[i] = arr[i];
    }
    for (int i = mid; i < arr.length; i++) {
      right[i - mid] = arr[i];
    }
    mergeSort(left);
    mergeSort(right);
    merge(arr, left, right);
  }

  public static void merge(Integer[] arr, Integer[] left, Integer[] right) {
    int j = 0;
    int k = 0;
    for (int i = 0; i < arr.length; i++) {
      if (j == left.length) {
        arr[i] = right[k++];
      } else if (k == right.length) {
        arr[i] = left[j++];
      } else if (left[j].compareTo(right[k]) < 0) {
        arr[i] = left[j++];
      } else {
        arr[i] = right[k++];
      }
    }
  }

}
