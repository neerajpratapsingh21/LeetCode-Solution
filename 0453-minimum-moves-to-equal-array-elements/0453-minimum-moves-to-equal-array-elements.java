class Solution {
    public int minMoves(int[] nums) {
       int n =  nums.length;
       int minel = Integer.MAX_VALUE;
       for(int i = 0; i < n ; i++){
       minel = Math.min(minel,nums[i]);
       }
       int cmin = 0;

       for(int i = 0;i<n;i++){
       cmin += nums[i] - minel;
       }
       return cmin;
    }
}