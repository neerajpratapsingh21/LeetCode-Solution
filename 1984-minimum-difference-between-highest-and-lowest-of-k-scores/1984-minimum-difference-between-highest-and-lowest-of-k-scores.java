class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        if(k == 1) return 0;
        Arrays.sort(nums);

        int left = 0;
        int right = 0;

      while(right < k-1){
        right++;
      }
      int ans = Integer.MAX_VALUE;

      while(right < n){
        ans = Math.min(ans,nums[right]-nums[left]);
        right++;
        left++;
      }
return ans;

    }
}