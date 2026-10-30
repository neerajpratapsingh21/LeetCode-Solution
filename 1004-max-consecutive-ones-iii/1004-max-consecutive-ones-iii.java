class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;
        int j = 0;
        int i = 0;
        int ans = 0;
        int og = k;
        while (j < n) {
            if (arr[j] == 0) {
                og--;
            }
            while (og < 0) {
                ans = Math.max(ans, j - i);
                if (arr[i] == 0)
                    og++;
                i++;
            }
            j++;
        }
        ans=Math.max(ans, j - i);
        return ans;
    }
}