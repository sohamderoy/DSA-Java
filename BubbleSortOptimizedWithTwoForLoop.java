// Bubble Sort = in-place sorting algo
// TC: O(n^2) ... for worst and average case
// TC: O(n) ... for bast case due to the optimization with isSwapped boolean
// SC: O(1)

// For worst case, total no of comparison = total no of swaps = n(n-1)/2

public class BubbleSortOptimizedWithTwoForLoop {
    
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean isSwapped;

        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }

            // Breaking out of the loop if there is no swap in the inner loop to optimize the code in case of best and average case 
            if (!isSwapped) {
                break;
            }
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
