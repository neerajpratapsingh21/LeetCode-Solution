class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int l = 0;
        int maxlen = 1;
        for(int r = 1; r < n; r++){
            if( nums[r-1] < nums[r] ){
                maxlen = Math.max(maxlen,r-l+1); 
            }else{
                l = r;
            }
        }
        return maxlen;
    }
}