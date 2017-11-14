package murraco;

public class Heapsort {

  // Time complexity: O(n*log(n)) - Space complexity: O(1)
  public static <T extends Comparable<T>> void heapSort(T[] arr) {
    buildMaxHeap(arr);
    int heapSize = arr.length - 1;
    for (int i = arr.length - 1; i > 0; i--) {
      swap(arr, 0, heapSize);
      heapSize--;
      maxHeapify(arr, 0, heapSize);
    }
  }

  public static <T extends Comparable<T>> void maxHeapify(T[] arr, int i, int n) {
    int leftChild = i * 2 + 1;
    int rightChild = leftChild + 1;
    int largest = i;
    if (leftChild <= n && arr[i].compareTo(arr[leftChild]) < 0) {
      largest = leftChild;
    }
    if (rightChild <= n && arr[largest].compareTo(arr[rightChild]) < 0) {
      largest = rightChild;
    }
    if (largest != i) {
      swap(arr, i, largest);
      maxHeapify(arr, largest, n);
    }
  }

  public static <T extends Comparable<T>> void buildMaxHeap(T[] arr) {
    for (int i = arr.length / 2; i > -1; i--) {
      maxHeapify(arr, i, arr.length - 1);
    }
  }

  public static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
    T temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
