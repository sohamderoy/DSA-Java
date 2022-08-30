// Prefix sum method
// TC: O(n^2)

public class MaxSubArraySum2_PrefixSum {

    public static int findMaxSubArray(int arr[]) {
        // finding prefix sum

        int prefixSum[] = new int[arr.length];
        int maxSum=Integer.MIN_VALUE;
        int currentSum;
        prefixSum[0] = arr[0];

        // formula to get prefixSum array = prefixAum[i-1]+arr[i] 
        // i.e. sum of all previous prefix sum + current element
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // finding max sum

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                // Formula to calculate sum = prefixArray[end] - prefixArray[start -1]
                currentSum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
 
    }
    


    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int maxSum = findMaxSubArray(arr);

        System.out.println("Max Sum = "+ maxSum);
    }
}
