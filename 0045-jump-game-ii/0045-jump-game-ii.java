class Solution {
    public int jump(int[] nums) {
         int n = nums.length;
         if(n == 1) return 0;
        int max = 0;
        int count = 0;
        int currEnd = 0;
        for(int i = 0; i < n; i++){
        max = Math.max(max, i + nums[i]);
           if(i == currEnd){
            count++;
            currEnd = max;
           }
           if (currEnd >= n - 1) break; 
        }
        return count;
    }
}