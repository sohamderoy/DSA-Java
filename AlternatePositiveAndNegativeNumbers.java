class Solution {
    void rearrange(int arr[], int n) {
        // code here
        
        int positive[] = new int[n];
        int negative[] = new int[n];
        int positiveIndex = 0;
        int negativeIndex = 0;
        int totalPositive= 0, totalNegative =0; 
        
        
        for (int i= 0; i< arr.length; i++){
            if(arr[i]>=0){
                positive[totalPositive] = arr[i];
                totalPositive++;
            }
            else {
                negative[totalNegative] = arr[i];
                totalNegative++;
            }
        }

        for (int i=0; i< arr.length; i++){
            if((i%2==0 && positiveIndex<totalPositive) || (negativeIndex==totalNegative)){
                arr[i]=positive[positiveIndex];
                positiveIndex++;
            }
            else if((i%2!=0 && negativeIndex<totalNegative) || (positiveIndex == totalPositive)){
                arr[i]=negative[negativeIndex];
                negativeIndex++;
            }
        }
    }
}