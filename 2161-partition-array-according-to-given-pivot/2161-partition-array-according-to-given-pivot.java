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
        int[] ans = new int[n];
        int ind = 0;
        for(int i : before){
            ans[ind++] = i;
        }
        for(int i : pivot){
            ans[ind++] = i;
        }
        for(int i : after){
            ans[ind++] = i;
        }
        return ans;
    }
}