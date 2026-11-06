class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        left[0]=1;
        int count = 1;
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i-1]){
                left[i] = count+1;
                count++;
            }else{
                count = 1;
                left[i] = 1;
            }
        }
        count = 1;
        int[] right = new int[n];
        right[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            if(ratings[i] > ratings[i+1]){
                right[i] = count+1;
                count++;
            }else{
                count = 1;
                right[i] = 1;
            }
        }
        int candy = 0;
        for(int i = 0; i<n; i++){
           candy += Math.max(left[i],right[i]);
        }
        return candy;
    }
}