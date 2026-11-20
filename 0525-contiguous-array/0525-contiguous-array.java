class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,-1);
        int diff = 0;
        int res = 0;
        for(int i = 0; i < n; i++){
         if(nums[i] == 0) diff--;
         else diff++;

         if(mpp.containsKey(diff)){
            res = Math.max(res,i-mpp.get(diff));
         }else{
            mpp.put(diff,i);
         }
        }
        return res;
    }
}