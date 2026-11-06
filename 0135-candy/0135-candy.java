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
         int candy = left[n-1];
       int curr = 1; 
        for(int i = n-2; i >= 0; i--){
            if(ratings[i] > ratings[i+1]){
                 curr++;
            }else{
               curr = 1;
            }
            candy += Math.max(left[i],curr);
        }
       
        return candy;
    }
}