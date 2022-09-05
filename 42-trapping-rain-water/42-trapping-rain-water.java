class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int left[] = new int[length];
        int right[] = new int[length];
        int totalWater = 0;
        
        // finding the maximum height in the left - left aux array
        
        left[0] = height[0];
        for (int i=1; i< length; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        
        // finding the maximum height in the right - right aux array
        
        right[length-1] = height[length-1];
        for (int i= length-2; i>=0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        
        // finding the total trapped water
        
        for(int i=0; i< length; i++){
            totalWater+=(Math.min(left[i], right[i]) - height[i]);
        }
        
        return totalWater;
    }
}