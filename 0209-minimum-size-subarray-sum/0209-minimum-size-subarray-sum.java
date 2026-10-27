class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l=0,r=0,sum = 0;
        int minlen = Integer.MAX_VALUE;
        while(r < n){
            sum += nums[r];
            while(sum >= target){
               minlen = Math.min(minlen,r-l+1);
                sum -= nums[l];
                l++;
            }
            r++;
        }

       return (minlen == Integer.MAX_VALUE) ? 0 : minlen;

    }
}