class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> indice = new HashMap<>();
        for(int i = 0 ;i < nums.length; i++){
            if(indice.containsKey(nums[i]) && (i-indice.get(nums[i]) <= k )){
                   return true;
            }
            indice.put(nums[i],i);
        }
        return false;
    }
}