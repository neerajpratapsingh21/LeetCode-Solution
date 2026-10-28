class Solution {
    public int findLHS(int[] nums) {
        int  n = nums.length;
        Map<Integer,Integer> f = new HashMap<>();
   int l = 0;
        for(int i = 0; i<n; i++){
            f.put(nums[i],f.getOrDefault(nums[i],0)+1);
        }
         for(int i = 0; i<n; i++){
            if(f.containsKey(nums[i]+1)){
         l = Math.max(l,(f.get(nums[i]+1) + f.get(nums[i])));
            }
        }
        return  l;
      
    }
}