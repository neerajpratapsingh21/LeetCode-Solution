class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0; int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        while(r<n){
            sum += nums[r];
            if(r > k-1){
                sum -= nums[l];
                l++;
            }
            if(r-l+1 == k){
                maxsum = Math.max(maxsum,sum);
            }
            r++;
        }
        return (double)maxsum/k;
    }
}