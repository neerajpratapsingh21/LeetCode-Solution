class Solution {
    public int[] singleNumber(int[] nums) {
         Map<Integer,Integer> map = new HashMap<>();
         List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])== 1){
                list.add(nums[i]);
            }
        }
      int ans[] = new int[list.size()];
      for(int i = 0; i<ans.length;i++){
        ans[i] = list.get(i);
      }
      return ans;
    }
}