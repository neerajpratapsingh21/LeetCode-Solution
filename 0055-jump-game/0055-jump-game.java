class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxind = 0;
        for(int i = 0; i < n; i++){
            if(maxind < i) return false;
            if(maxind >= n) return true;
            maxind  = Math.max(maxind,i+nums[i]);
        }
        return true;
    }
}