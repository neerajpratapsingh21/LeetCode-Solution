class Solution {
    public int longestSubarray(int[] nums) {
      int n = nums.length;
      int c = 0;  
      int l = 0;
      int maxlen = 0;
      for(int i = 0; i<n; i++){
        if(nums[i] == 0) c++;
        while(c>1){
            if(nums[l]==0) c--;
            l++;
        }
        maxlen = Math.max(maxlen, i-l+1-c);
      }
      if(maxlen == n){
        return n-1;
      }
      return maxlen;
    }
}