class Solution {
    public int maxSubArray(int[] nums) {
         int n = nums.length;
        int sum = nums[0];
        int maxsum = nums[0];
        for(int i = 1; i < n; i++){
            if(sum + nums[i%n] > nums[i%n]){
                sum += nums[i%n];
            }else{
                sum = nums[i%n];
            }
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
    }
}