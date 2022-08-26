// TC: O(n^2)
// Total number of pairs = n(n-1)/2

public class PairsInArray {

    public static void printPairs(int arr[]) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+totalPairs);
    }
     
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        printPairs(arr);
        
    }
}
