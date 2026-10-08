class Solution {
    public boolean check(int[] nums) {
        int breaks = 0;
        int n = nums.length;

        for (int i = 1; i <= n; i++) {
            if (nums[i-1] > nums[i%n]) {
                breaks++;
            }
        }

        return breaks <= 1;
    }
}