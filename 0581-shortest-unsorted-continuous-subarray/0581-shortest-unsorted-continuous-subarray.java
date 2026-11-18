class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;

        int[] arr = Arrays.copyOf(nums,n);

        Arrays.sort(arr);

        int l = 0;
        int r = n-1;

        while( l <= r && arr[l] == nums[l]) l++;

         while( l <= r && arr[r] == nums[r]) r--;

        return r - l + 1;
         
    }
}