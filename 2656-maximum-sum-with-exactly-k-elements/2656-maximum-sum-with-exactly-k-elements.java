class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n= nums.length;
       int max = 0;
       for(int i=0;i<n;i++){
        max = Math.max(nums[i],max);
       } 
       return (k * max) + (k * (k - 1)) / 2;
    }
}