import java.util.Comparator;

/**
 * Your implementation of various iterative sorting algorithms.
 */
public class Sorting {

    private static <T> void swap(int firstIndex, int secondIndex, T[] arr) {
        T temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
    /**
     * Implement bubble sort.
     *
     * It should be:
     * in-place
     * stable
     * adaptive
     *
     * Have a worst case running time of: O(n^2)
     * And a best case running time of: O(n)
     *
     * NOTE: You should implement bubble sort with the last swap optimization.
     *
     * You may assume that the passed in array and comparator
     * are both valid and will never be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array that must be sorted after the method runs.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        boolean sorted = false;
        boolean madeASwap = false;
        int until = arr.length - 1;
        int end = until;
        while (!sorted) {
            madeASwap = false;
            end = until;
            for (int i = 0; i < end; i++) {
                if (comparator.compare(arr[i], arr[i+1]) > 0) {
                    until = i;
                    swap(i, i+1, arr);
                    madeASwap = true;
                }
            }
            if (!madeASwap || until == 0) {
                sorted = true;
            }
        }
    }

    /**
     * Implement selection sort.
     *
     * It should be:
     * in-place
     * unstable
     * not adaptive
     *
     * Have a worst case running time of: O(n^2)
     * And a best case running time of: O(n^2)
     *
     * You may assume that the passed in array and comparator
     * are both valid and will never be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array that must be sorted after the method runs.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void selectionSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        for (int i = 0; i < arr.length - 1; i++) {
            int currIndex = i;
            int minEIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (comparator.compare(arr[minEIndex], arr[j]) > 0) {
                    minEIndex = j;
                }
            }
            swap(currIndex, minEIndex, arr);
        }
    }

    /**
     * Implement insertion sort.
     *
     * It should be:
     * in-place
     * stable
     * adaptive
     *
     * Have a worst case running time of: O(n^2)
     * And a best case running time of: O(n)
     *
     * You may assume that the passed in array and comparator
     * are both valid and will never be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array that must be sorted after the method runs.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void insertionSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && comparator.compare(arr[j-1], arr[j]) > 0) {
                swap(j-1, j, arr);
                j--;
            }
        }

    }
}