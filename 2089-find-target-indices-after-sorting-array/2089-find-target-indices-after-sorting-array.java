class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[i]== target) {
                ans.add(i);
            }
            if(!ans.isEmpty() && nums[i] != target) return ans;
        }
        return ans;
           }
}