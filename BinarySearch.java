// TC: O(log n)

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int key =22;
        int index = binarySearch(arr, key);
        if (index == -1)
            System.out.println("key not found");
        else System.out.println("key found at index " + index);
    }
    
}
