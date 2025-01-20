package Sorting_Java;

public class Quick_Sort {
    // partition function
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = low - 1; // Pointer for the smaller element
        for (int j = low; j < high; j++) { // Iterate from low to high - 1
            if (arr[j] < pivot) { // If current element is smaller than the pivot
                i++; // Increment the index of the smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Return the partition index
    }

    // quick sorting technique
    public static void quick(int arr[], int low, int high) {
        if (low < high) {
            int pivot_Idx = partition(arr, low, high);

            quick(arr, low, pivot_Idx - 1);
            quick(arr, pivot_Idx + 1, high);
        }
    }

    public static void main(String[] args) {
        // function call
        int arr[] = { 3, 2, 8, 5, 1, 7 };
        quick(arr, 0, arr.length - 1);
        // print
        System.out.println("sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }
}
