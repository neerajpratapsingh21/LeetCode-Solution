class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long ans = 0;
        
        for(int i=0;i<n;i++){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
         for(int j=i;j<n;j++){
           largest =Math.max(largest,nums[j]);
           smallest = Math.min(smallest,nums[j]);
           ans = (ans + (largest - smallest));
         }
        }
        return ans;
    }
}