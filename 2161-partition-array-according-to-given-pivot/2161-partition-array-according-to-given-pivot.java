class Solution {
    public int[] pivotArray(int[] nums, int p) {
        int n = nums.length;
        if(n <= 1) return nums;
        int ind = 0;
        List<Integer> after = new ArrayList<>();
        for(int i : nums){
            if(i < p) nums[ind++] = i;
            else if(i == p) after.addFirst(i);
            else after.add(i);
        }
        for(int i : after){
            nums[ind++] = i;
        }
        return nums;
    }
}