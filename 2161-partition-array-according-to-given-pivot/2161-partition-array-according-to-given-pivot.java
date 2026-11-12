class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         int n = nums.length;
        int[] res = new int[n];
        int start =0;
        int end = n-1;
        int left =0;
        int right = n-1;
        while(end >=0){
            if(nums[start] < pivot) res[left++] = nums[start];
            if(nums[end] > pivot) res[right--] = nums[end];
            start++;
            end--;
        }
       for(int i=left;i<=right;i++) res[i] = pivot;
       return res;
    
    }
}