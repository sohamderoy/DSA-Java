// Kadanes Algo
// TC: O(n)

public class MaxSubArraySum3_KadanesAlgo {

    public static int maxSumSubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int maxSumIfAllValueNegative = Integer.MIN_VALUE;
        boolean isAllValueNegative = true;


        // Kadanes Algo for special case if all number are negative
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                isAllValueNegative = false;
                break;
            } else {
                maxSumIfAllValueNegative = Math.max(maxSumIfAllValueNegative, arr[i]);
            }
        }
        
        // Kadanes Algo
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // making current Sum = 0 if current Sum goes below 0
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum); 
        }

        return isAllValueNegative ? maxSumIfAllValueNegative : maxSum ;
    }

    public static void main(String args[]) {
        int arr[] = { -2, -6, -3 };
        int maxSum = maxSumSubArray(arr);
        System.out.println("Max sum = " + maxSum);
    }
}