class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n  = nums.length;
        int i = 0;
        int d = 0;
        int longestI = 1;
        int longestD = 1;
        for(int j = 1; j < n; j++){
            if(nums[j] > nums[j-1]){
                longestI = Math.max(longestI,j-i+1);
            }else{
                i = j;
            }
             if(nums[j] < nums[j-1]){
                longestD = Math.max(longestD,j-d+1);
            }else{
                d = j;
            }
        }
        return Math.max(longestI,longestD);
    }
}