// TC: O(n)
// SC: O(1)

public class ReverseArray {

    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        reverseArray(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}
