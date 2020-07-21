# Sorting Algorithms

![](https://img.shields.io/badge/build-success-brightgreen.svg)
![](https://img.shields.io/badge/test-pass-brightgreen.svg)

# Algorithms

![](https://img.shields.io/badge/bubblesort-✓-blue.svg)
![](https://img.shields.io/badge/insertionsort-✓-blue.svg)
![](https://img.shields.io/badge/selectionsort-✓-blue.svg)
![](https://img.shields.io/badge/mergesort-✓-blue.svg)
![](https://img.shields.io/badge/heapsort-✓-blue.svg)
![](https://img.shields.io/badge/quicksort-✓-blue.svg)

***

<h3 align="center">Please help this repo with a :star: if you find it useful! :blush:</h3>

***

# File Structure

```
sorting-algorhtms/
 │
 ├── src/main/java/murraco
 │   └── murraco
 │       ├── BubbleSort.java
 │       ├── Heapsort.java
 │       ├── InsertionSort.java
 │       ├── MergeSort.java
 │       ├── Quicksort.java
 │       └── SelectionSort.java
 │
 ├── src/test/java/
 │   └── murraco         
 │       └── SortingAlgorithmsTest.java
 │
 ├── .gitignore
 ├── pom.xml
 └── README.md
 ```

## BubbleSort

**stable:** `Yes` - **time:** `O(n^2)` - **space:** `O(1)`

In bubble sort, we start at the beginning of the array and swap the first two elements if the first is greater than the second. Then, we go to the next pair, and so on, continuously making sweeps of the array until it's sorted

The single best advantage of a bubble sort is that it's very simple to understand and code from memory. Additionally, it's a stable sort algorithm that requires no additional memory, since all swaps are made in place. Normally it's `O(n^2)` runtime, and hence is very slow for large data sets.

## InsertionSort

**stable:** `Yes` - **time:** `O(n^2)` - **space:** `O(1)`

It's a stable sorting algorithm that seeks to sort a list one element at a time. With each iteration, it takes the next element waiting to be sorted, and adds it, in proper location, to those elements that have already been sorted.

It works very efficiently for lists that are nearly sorted initially. Furthermore, it can also work on data-sets that are constantly being added to. For instance, if one wanted to maintain a sorted list of the highest scores achieved in a game, an insertion sort would work well since the new elements would be added to the data as the game was played.

## SelectionSort

**stable:** `No` - **time:** `O(n^2)` - **space:** `O(1)`

It starts with the first element in the array (or list) and scans through the array to find the element with the smallest key, which it swaps with the first element. The process is then repeated with each subsequent element until the last element is reached.

It has the advantage that requires at most `n-1` swaps. In situations in which moving data elements is more expensive than comparing them, selection sort may perform better than other algorithms. The efficiency of an algorithm depends on what you're optimizing for.

## MergeSort

**stable:** `No` - **time:** `O(n log n)` - **space:** `O(n)`

Merge sort is a divide-and-conquer algorithm that works by splitting a data set into two or more subsets, sorting the subsets, and then merging them together into the final sorted set.

Unlike most other sorting algorithms, merge sort is a good choice for data-sets that are too large to fit into memory. In a typical scenario, the contents of a large file are split into multiple smaller files. Each of the smaller files is read into memory, sorted using an appropriate algorithm, and written back out. A merge operation is then performed using the sorted files as input and the sorted data is written directly to the final output file.

Each recursively-call has `O(n)` runtime, and a total of `O(log n)` recursions are required, thus the runtime of this algorithm is `O(n log n)`. A merge sort can also be modified for performance on lists that are nearly sorted to begin with. After sorting each half of the data, if the highest element in one list is less than the lowest element in the other half, then the merge step is unnecessary.

Apart from being fairly efficient, a merge sort has the advantage that it can be used to solve other problems such as determining how **unsorted** a given list is.

## Heapsort

**stable:** `No` - **time:** `O(n log n)` - **space:** `O(1)`

Heapsort is simple to implement, performs an `O(n log n)` in place sort, but is not stable.

The first loop, the `O(n)` **heapify** phase, puts the array into heap order. The second loop, the `O(n log n)` **sortdown** phase, repeatedly extracts the maximum and restores heap order.

Both phases are slightly adaptive, though not in any particularly useful manner. In the nearly sorted case, the heapify phase destroys the original order. In the reversed case, the heapify phase is as fast as possible since the array starts in heap order, but then the sortdown phase is typical. In the few unique keys case, there is some speedup, but not as much as in 3-way quicksort.

## Quicksort

**stable:** `No` - **time:** `O(n log n)` - **space:** `O(log n)`

Quicksort is a divide-and-conquer algorithm that involves choosing a pivot value from a data-set and splitting the set into two subsets: a set that contains all values less than the pivot and a set that contains all values greater than or equal to the pivot. The pivot/split process is recursively applied to each subset until there are no more subsets to split. The results are combined to form the final sorted set.

The challenge of a quicksort is to determine a reasonable **midpoint** value for dividing the data into two groups. The efficiency of the algorithm is entirely dependent upon how successfully and accurate the midpoint value is selected. In the best case, the runtime is `O(n log n`). In the worst case where one of the two groups always has only a single element, the runtime drops to `O(n^2)`.

If it's known that the data to be sorted all fit within a given range, or fit a certain distribution model, this knowledge can be used to improve the efficiency of the algorithm by choosing midpoint values that are likely to divide the data in half as close to evenly as possible. A generic algorithm that is designed to work without respect to data types or value ranges may simply select a value from the unsorted list, or use some random method to determine the midpoint.

# Contribution

- Report issues
- Open pull request with improvements
- Spread the word
- Reach out to me directly at <mauriurraco@gmail.com>
