// Selection Sort
// TC: O(n^2)
// SC: O(1)


public class SelectionSort {

    public static void selectionSort(int a[]) {
        int n = a.length;
        int minIndex, temp;
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[]) {
        int arr[] = { 3, 5, 7, 8, 2, 5, 7, 9, 3, 2, 43, 4, 56, 2, 124, 34, 4, 56, 6, 56, 8767, 2, 3, 42, 3, 3, 545, 6 };

        selectionSort(arr);
    }
}
