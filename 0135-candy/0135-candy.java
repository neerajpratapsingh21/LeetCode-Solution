class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;

         int candy = 1;
         int i = 1;
         while( i < n){
            if(ratings[i] == ratings[i-1]){
                candy += 1;
                i++;
                continue;
            }
            int peak = 1;

            while(i<n && ratings[i] > ratings[i-1]){
                peak++;
                candy+=peak;
                i++;
            }
            int down = 1;
            while(i<n && ratings[i] < ratings[i-1]){
                candy += down;
                i++;
                down++;
            }
            if(down > peak){
                candy += down - peak;   
            }
         }
        return candy;
    }
}