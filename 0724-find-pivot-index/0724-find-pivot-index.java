class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
       int totalSum = 0;
       
        for(int i = 0; i<n ; i++){
           totalSum += nums[i];
        }

        int leftsum = 0;
        for(int i = 0; i<n ; i++ ){
            totalSum -= nums[i];
            if(leftsum == totalSum) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}