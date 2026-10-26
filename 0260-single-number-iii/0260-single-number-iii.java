class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        long xor = 0;
        for(int i = 0;i<n;i++) xor ^= nums[i];
        int rmbit = (int)((xor & xor - 1) ^ xor);
        int b1 = 0, b2 = 0;
        for(int i = 0; i < n; i++){
            if((nums[i] & rmbit) != 0) b1 ^= nums[i];
            else b2 ^= nums[i];
        }
        return new int[]{b1,b2};
    }
}