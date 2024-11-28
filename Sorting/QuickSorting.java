package Sorting;

public class QuickSorting {
    // Modified swap method to swap elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int s, int e) {
        int pivot = arr[s];  // 1st element taken as pivot
        int cnt = 0;

        // Count how many elements are smaller than or equal to the pivot
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivot) {
                cnt++;
            }
        }

        // Place pivot element at its correct position
        int pivIdx = s + cnt;
        swap(arr, pivIdx, s);  // Fix the swap call

        // Now partition the array based on pivot
        int i = s, j = e;

        while (i < pivIdx && j > pivIdx) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivIdx && j > pivIdx) {
                swap(arr, i++, j--);  // Fix the swap call
            }
        }
        return pivIdx;
    }

    public static void QuickSort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int pivIdx = partition(arr, s, e);
        QuickSort(arr, s, pivIdx - 1);
        QuickSort(arr, pivIdx + 1, e);
    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1, 8};
        int n = arr.length;
        QuickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

