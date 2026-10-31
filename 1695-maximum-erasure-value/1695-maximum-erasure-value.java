class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxsum = 0;
        while( r < n ){
            if(map.containsKey(nums[r])){
                int i = l;
                l = Math.max(l,map.get(nums[r])+1);
                while( i < l){
                    sum -= nums[i];
                    i++;
                }
            }
            sum += nums[r];
             maxsum = Math.max(maxsum, sum);
             map.put(nums[r],r);
             r++;
        }
        return maxsum;
            }
}