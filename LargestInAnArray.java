// TC: O(n)

public class LargestInAnArray {

    public static int largestInArray(int[] arr) {
        int largeNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largeNumber) {
                largeNumber = arr[i];
            }
        }
        return largeNumber;
    }
    


    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 3, 55, 2, 1, 11, 4, 54, 101 };

        int largestNumber = largestInArray(arr);
        System.out.println("Largest number in the array is "+ largestNumber);

    }
}
