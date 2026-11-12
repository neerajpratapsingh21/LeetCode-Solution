class Solution {
    public int[] pivotArray(int[] nums, int p) {
        int n = nums.length;
        if(n <= 1) return nums;
        List<Integer> before = new ArrayList<>();
        List<Integer> pivot = new ArrayList<>();
        List<Integer> after = new ArrayList<>();
        for(int i : nums){
            if(i < p) before.add(i);
            else if(i == p) pivot.add(i);
            else after.add(i);
        }
        
        int ind = 0;
        for(int i : before){
            nums[ind++] = i;
        }
        for(int i : pivot){
            nums[ind++] = i;
        }
        for(int i : after){
            nums[ind++] = i;
        }
        return nums;
    }
}