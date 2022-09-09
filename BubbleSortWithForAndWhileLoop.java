// Bubble Sort
// TC: O(n^2)
// SC: O(1)

public class BubbleSortWithForAndWhileLoop {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean somethingSwapped = true;

        while (somethingSwapped) {
            somethingSwapped = false; // Start with the assumption that there will be nothing to be swapped. ie. array is completely sorted
            for (int i = 0; i < n - 1; i++) {
                int temp;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    somethingSwapped = true; // Turn somethingSwapped to true which means the array was not completely sorted this time
                }
            }
            // If the somethingSwapped flag remains false at the end of the main while iteration then it means array is completely sorted. No more white iterations needed.
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String args[]) {
        int arr[] = { 3, 5, 7, 8, 2, 5, 7, 9, 3, 2, 43, 4, 56, 2, 124, 34, 4, 56, 6, 56, 8767, 2, 3, 42, 3, 3, 545, 6 };

        bubbleSort(arr);
    }
    
}
