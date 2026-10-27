class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0; double sum = 0;
        double maxavg = -Math.pow(10,4);
        while(r<n){
            sum += nums[r];
            if(r > k-1){
                sum -= nums[l];
                l++;
            }
            if(r-l+1 == k){
                maxavg = Math.max(maxavg,sum/k);
            }
            r++;
        }
        return maxavg;
    }
}