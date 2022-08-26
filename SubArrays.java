// TC: O(n^3)
// total number of sub arrays = n(n+1)/2

public class SubArrays {

    public static void printSubArrays(int arr[]) {
        int noOfPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.print("]");
                System.out.print(" ");
                noOfPairs++;
            }
            System.out.println();
        }
        
        System.out.println("total number of sub arrays " +noOfPairs);
    }
    

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        printSubArrays(arr);
    }
}
