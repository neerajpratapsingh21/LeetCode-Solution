class Solution {
    public int totalFruit(int[] nums) {
      int n = nums.length;
      int maxlen = 0;
      int l = 0;
      Map<Integer,Integer> map = new HashMap<>();
      for(int i = 0; i < n; i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        while(map.size() > 2){
         map.put(nums[l],map.get(nums[l])-1);
         if(map.get(nums[l]) == 0) map.remove(nums[l]);
         l++;
        }
        maxlen = Math.max(maxlen, i-l+1);
      }
     return maxlen;
    }
}