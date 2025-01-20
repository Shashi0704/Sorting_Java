package Sorting_Java;

public class Selection {
    // selection sorting function
    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        System.out.print("Sorted array is");
        {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("\t" + arr[i]);
            }
        }
    }

    // main function
    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 6, 2 };
        // function call
        selection(arr);
    }
}
