package Sorting_Java;

public class Bubble_Sort {
    // Bubble sorting function
    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        System.out.print("Sorted array is");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("\t" + arr[i]);
        }

    }

    // main function
    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 6, 2 };
        // function call
        bubble(arr);
    }
}
