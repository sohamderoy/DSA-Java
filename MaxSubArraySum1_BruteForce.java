// Brute force method
// TC = O(n^3)


public class MaxSubArraySum1_BruteForce {
    public static int findMaxSumOfSubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
                if (sum > maxSum)
                    maxSum = sum;
            }
        }

        return maxSum;
    }



    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int maxSumOfSubArray = findMaxSumOfSubArray(arr);
        System.out.println("max sum = "+ maxSumOfSubArray);
    }
}
